import React, { useState } from 'react';

function App() {
  const [inputValue, setInputValue] = useState('');

  const handleChange = (e) => {
    setInputValue(e.target.value);
  };

  return (
    <div>
      <form onSubmit={(e) => e.preventDefault()}>
        <label>
          Enter something: 
          <input type="text" value={inputValue} onChange={handleChange} />
        </label>
      </form>
      <p>You entered: {inputValue}</p>
    </div>
  );
}

export default App;
