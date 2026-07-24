import React, { useState } from 'react';

function useCounter(initialValue = 0) {
  const [count, setCount] = useState(initialValue);

  const increment = () => setCount(count + 1);

  return { count, increment };
}

function App() {
  const { count, increment } = useCounter(10);

  return (
    <div>
      <h2>Custom Hook Example</h2>
      <p>Value: {count}</p>
      <button onClick={increment}>Increment Value</button>
    </div>
  );
}

export default App;
