# 📘 Day 10 – Java Strings

## 📚 Topics Covered
- String Introduction
- String Creation
- String Methods
- String Comparison (`==`, `equals()`, `compareTo()`)
- Count Vowels and Consonants
- Palindrome String
- StringBuilder
- StringBuffer

---

## 📖 Introduction

A **String** is a sequence of characters used to store text in Java. Strings are **immutable**, which means their values cannot be changed after they are created.

---

## 📝 String Creation

### 1. Using String Literal
- Stored in the String Pool.
- Memory efficient.
- Recommended approach.

### 2. Using `new` Keyword
- Creates a new object in heap memory.
- A new object is created even if the same value already exists.

---

## 🔍 String Comparison

### `==`
- Compares object references (memory locations).

### `equals()`
- Compares the contents of two strings.

### `compareTo()`
- Compares strings lexicographically.
- Returns:
  - `0` → Strings are equal
  - Positive value → First string is greater
  - Negative value → Second string is greater

---

## 🔧 Common String Methods

- `length()`
- `charAt()`
- `toUpperCase()`
- `toLowerCase()`
- `equals()`
- `equalsIgnoreCase()`
- `compareTo()`
- `contains()`
- `substring()`
- `replace()`
- `indexOf()`
- `lastIndexOf()`
- `startsWith()`
- `endsWith()`
- `trim()`
- `split()`
- `isEmpty()`
- `concat()`
- `toCharArray()`

---

## 🔤 Count Vowels and Consonants

### Logic
- Convert the string to lowercase.
- Traverse each character.
- If the character is a vowel, increase the vowel count.
- If the character is an alphabet but not a vowel, increase the consonant count.

---

## 🔁 Palindrome String

A palindrome is a string that reads the same forward and backward.

### Logic
- Reverse the string.
- Compare the original string with the reversed string.
- If both are equal, it is a palindrome.
- Otherwise, it is not a palindrome.

---

## ⚡ StringBuilder

`StringBuilder` is a mutable class used for efficient string manipulation.

### Features
- Mutable
- Fast performance
- Not thread-safe
- Suitable for single-threaded applications

---

## ⚡ StringBuffer

`StringBuffer` is also mutable but synchronized.

### Features
- Mutable
- Thread-safe
- Slightly slower than StringBuilder
- Suitable for multi-threaded applications

---

## 📊 String vs StringBuilder vs StringBuffer

| Feature | String | StringBuilder | StringBuffer |
|---------|--------|---------------|--------------|
| Mutable | ❌ No | ✅ Yes | ✅ Yes |
| Thread Safe | ❌ No | ❌ No | ✅ Yes |
| Performance | Slow (Frequent Modifications) | Fast | Moderate |
| Use Case | Fixed Text | Single-threaded Applications | Multi-threaded Applications |

---

## 💻 Programs Practiced

- String Creation
- String Comparison
- String Methods
- Reverse String
- Count Vowels and Consonants
- Palindrome String
- StringBuilder Operations
- StringBuffer Operations

---

## 🎯 Key Takeaways

- Strings are immutable.
- Use `equals()` to compare string contents.
- Use `compareTo()` for lexicographical comparison.
- `StringBuilder` is faster for frequent modifications.
- `StringBuffer` is thread-safe.
- Java provides many built-in methods to simplify string manipulation.

---

## 🚀 Conclusion

Today, I learned the fundamentals of Java Strings, including string creation, comparison techniques, built-in methods, counting vowels and consonants, palindrome checking, and the differences between `String`, `StringBuilder`, and `StringBuffer`. These concepts strengthen problem-solving skills and form the foundation for solving string-based coding challenges in Java.
