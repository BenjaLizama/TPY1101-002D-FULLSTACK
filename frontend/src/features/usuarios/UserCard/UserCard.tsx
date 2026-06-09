import React from "react";
import type { UserCardPorps } from "./UserCard.types";
import styles from "./UserCard.module.css";
export default function UserCard({
  age,
  email,
  lastName,
  name,
  rigthItem,
}: UserCardPorps) {
  return (
    <div className={styles.container}>
      <div className={styles.content}>
        <text>{name}</text>
        <text>{lastName}</text>
        <text>{age}</text>
        <text>{email}</text>
      </div>
      <div>{rigthItem}</div>
    </div>
  );
}
