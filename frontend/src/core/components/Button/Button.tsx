import React from "react";
import type { ButtonProps } from "./ButtonProps";
import styles from "./Button.module.css";

export default function Button({ text, onpress }: ButtonProps) {
  return (
    <div className={styles.contenerdor}>
      <button onClick={onpress} className={styles.button}>
        {text}
      </button>
    </div>
  );
}
