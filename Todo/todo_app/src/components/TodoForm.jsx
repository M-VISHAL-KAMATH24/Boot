import React, { useState } from 'react';

const TodoForm = ({ onAdd }) => {
  const [task, setTask] = useState('');
  const [priority, setPriority] = useState('medium');

  const handleSubmit = (e) => {
    e.preventDefault();
    if (task.trim()) {
      onAdd({ task: task.trim(), priority, completed: false });
      setTask('');
      setPriority('medium');
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
      />
      <select 
        value={priority} 
        onChange={(e) => setPriority(e.target.value)}
        className="priority-select"
      >
        <option value="low">Low</option>
        <option value="medium">Medium</option>
        <option value="high">High</option>
      </select>
      <button type="submit" className="submit-btn">
        Add Task
      </button>
    </form>
  );
};

export default TodoForm;
