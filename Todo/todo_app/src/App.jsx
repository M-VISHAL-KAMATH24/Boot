import { useState, useEffect } from 'react';
import Header from './components/Header';
import TodoForm from './components/TodoForm';
import axios from 'axios';

const API_BASE_URL = '/api/todos';  // ← CHANGED: Use proxy instead of full URL

function App() {
  const [todos, setTodos] = useState([]);

  // Fetch todos on load
  useEffect(() => {
    fetchTodos();
  }, []);

  const fetchTodos = async () => {
    try {
      const response = await axios.get(API_BASE_URL);
      setTodos(response.data);
    } catch (error) {
      console.error('Error fetching todos:', error);
      // Optional: Show user-friendly message
      console.log('Make sure backend is running on port 8080');
    }
  };

  const addTodo = (newTodo) => {
    setTodos([newTodo, ...todos]);
  };

  return (
    <div className="body">
      <Header />
      <main className="container main-content">
        <TodoForm onAdd={addTodo} />
        <div className="text-center text-gray-600 mt-4">
          <p>Total tasks: {todos.length}</p>
          {todos.length === 0 && <p>No tasks yet. Add one above!</p>}
        </div>
      </main>
    </div>
  );
}

export default App;
