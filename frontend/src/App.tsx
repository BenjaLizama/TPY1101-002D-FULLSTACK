import { useState } from "react";

import Button from "./core/components/Button";
import UserCard from "./features/usuarios/UserCard";
import styles from "./App.module.css";

function App() {
  return (
    <>
      <div className={styles.container}>
        <UserCard
          name="lucciano"
          age={20}
          email="hola@gmail.com"
          lastName="marinez"
          rigthItem={<Button text="hola"></Button>}
        ></UserCard>
      </div>
    </>
  );
}

export default App;
