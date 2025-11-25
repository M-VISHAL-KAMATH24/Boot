import React, { useState } from 'react';
import axios from 'axios';

const API_BASE_URL = 'http://localhost:8080/api/todos';

const TodoForm = ({ onAdd }) => {
  const [task, setTask] = useState('');
  const [priority, setPriority] = useState('medium');
  const [loading, setLoading] = useState(false);

  const handleSubmit = async (e) => {
    e.preventDefault();
    if (task.trim()) {
      setLoading(true);
      try {
        const response = await axios.post(API_BASE_URL, {
          task: task.trim(),
          priority,
          completed: false
        });
        onAdd(response.data);  // Add returned todo with ID from backend
        setTask('');
        setPriority('medium');
      } catch (error) {
        console.error('Error adding todo:', error);
        alert('Failed to add task. Is backend running on port 8080?');
      } finally {
        setLoading(false);
      }
    }
  };

  return (
    <form onSubmit={handleSubmit} className="todo-form">
      <input
        type="text"
        value={task}
        onChange={(e) => setTask(e.target.value)}
        placeholder="Add a new task..."
        className="task-input"
        disabled={loading}
      />
      <select 
        value={priority} 
        onChange={(e) => setPriority(e.target.value)}
        className="priority-select"
        disabled={loading}
      >
        <option value="low">Low</option>
        <option value="medium">Medium</option>
        <option value="high">High</option>
      </select>
      <button 
        type="submit" 
        className="submit-btn"
        disabled={loading || !task.trim()}
      >
        {loading ? 'Adding...' : 'Add Task'}
      </button>
    </form>
  );
};

export default TodoForm;
