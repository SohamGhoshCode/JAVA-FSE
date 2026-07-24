import React, { createContext, useContext } from 'react';

const ThemeContext = createContext();

function Child() {
  const theme = useContext(ThemeContext);
  return (
    <div>
      <p>Current Theme: {theme}</p>
    </div>
  );
}

function App() {
  return (
    <ThemeContext.Provider value="Dark Mode">
      <div>
        <h2>useContext Example</h2>
        <Child />
      </div>
    </ThemeContext.Provider>
  );
}

export default App;
