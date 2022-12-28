# Employee Management System

# Technologies

- Java JDK 8
- Spring Security
- Thymeleaf
- PostgreSQL
- JWT (JSON Web Token)

## Feature

- Registration and Login

# Model

- User, berisi data user
- Employee
- Job Experience / Employee Work Experience
- employee educational background
- employee training history
- 1 Employee bisa memilik banyak Job Experience, Education Background, dan Training History

# Cara Kerja

- Ada Security untuk Login,
- Data hanya berisi Form


# Langkah-langkah Pengerjaan

- Kita buat sistem Register dan Login nya

# Alur Sistem

- Employee baru harus mendaftar pada aplikasi kita terlebih dahulu. Pendaftaran employee hanya memasukkan `email` dan `password`. Baru dia akan mendapatkan role sebagai `user`
- Setelah mendaftar maka employee bisa login
- Employee baru bisa login
- Lalu employee akan menginputkan biodata dirinya sendiri

# SAMPLE DATA USER
- Role Admin

```json
{
  "email": "admin@mail.com",
  "password": "admin123"
}
```
- Role User 1

```json
{
  "email": "albert@mail.com",
  "password": "albert123"
}
```
- Role User 2

```json
{
  "email": "jack@mail.com",
  "password": "jack123"
}
```