import React, { useEffect } from 'react';

function App() {
  useEffect(() => {
    console.log("Component loaded");
  }, []);

  return (
    <div>
      <p>useEffect exercise component.</p>
    </div>
  );
}

export default App;
