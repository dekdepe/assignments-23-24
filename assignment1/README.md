# Tugas Pemrograman 1: Methods

CSGE601021 Dasar-Dasar Pemrograman 2 @ Fakultas Ilmu Komputer Universitas Indonesia, Semester Genap 2023/2024

Tugas Pemrograman ini mencakup materi berikut:

- Percabangan dan perulangan
- *Methods*
- Manipulasi *string*

## Daftar Isi

1. [Dokumen Soal](#dokumen-soal)
2. [Persiapan](#persiapan)
3. [Menjalankan dan menguji program](#menjalankan-dan-menguji-program)
4. [Pengumpulan](#pengumpulan)
5. [Daftar pekerjaan](#daftar-pekerjaan)
    1. [Daftar pekerjaan wajib](#daftar-pekerjaan-wajib)
6. [Penilaian](#penilaian)

## Dokumen Soal

Dokumen soal dapat diakses melalui [link ini](https://docs.google.com/document/d/1J3fh-aa8UZogIOnjDplaZbCjOLwY7gzBDVcdyj0krxI/edit?usp=sharing).

## Persiapan

Silakan ikuti persiapan yang ada pada berkas [`README.md`](../README.md) di
*root* repositori ini.

> Template pengerjaan tugas ini disediakan di *path*
`src\main\java\assignments\assignment1`

## Menjalankan dan menguji program

> Catatan:<br>
> - Ubah `gradlew.bat` dengan `./gradlew` dan `\` dengan `/` jika kamu
    menggunakan Linux/Mac.
> - Tanda <kbd>></kbd> pada awal *command* tidak perlu ditulis.
    Digunakan sebagai pembeda antara *command* dan *output*-nya

Kamu bisa menjalankan beberapa *task* dengan Gradle melalui IDE atau
terminal/Command Prompt.
Jalankan *task* tersebut di **root folder** dari repository ini.

Untuk menjalankan program:

```bash
> gradlew.bat :assignment1:run --console plain
```

Untuk menguji program dengan *test case* yang disediakan:

```bash
> gradlew.bat :assignment1:test
```

> Tips: kamu bisa memeriksa hasil tes dalam bentuk dokumen HTML. Lihat dokumen
> HTML tersebut di dalam folder `build\reports` yang ada di direktori ini.

Jika kamu tidak ingin menggunakan Gradle, kamu juga bisa melakukan kompilasi
dan menjalankan program dengan `javac` dan `java` seperti biasa. Masuk ke
direktori `src\main\java`, *compile* semua berkas `.java` kamu, dan jalankan
*main class*-nya.

```bash
> cd src\main\java
src\main\java> javac assignments\assignment1\*.java
src\main\java> java assignments.assignment1.OrderGenerator
```

> Catatan: <kbd>src\main\java></kbd> tidak perlu ditulis saat menjalankan *command*-nya (hanya menandakan bahwa anda sudah berada di folder src\main\java)

Kamu juga bisa memeriksa kebenaran program kamu dengan membandingkan nilai
*return* dari *method* `OrderGenerator` dengan nilai *return* yang
diharapkan. Terdapat beberapa *test case* yang bisa kamu lihat di dalam
berkas `src\test\java\assignments\assignment1\OrderGeneratorTest.java`.

Kode seperti berikut:

```java
assertEquals("HOLY1802202453C3", OrderGenerator.generateOrderID("Holycow!", "18/02/2024", "9928765403"));
```

artinya jika *method* `generateOrderId` dipanggil dengan argumen `"Holycow!", "18/02/2024", "9928765403"`,
maka ia harus mengembalikan nilai yang setara dengan `HOLY1802202453C3`.

## Pengumpulan

Simpan pekerjaan kamu, lalu lakukan `git add`, `git commit`, dan `git push`
sebagaimana dijelaskan pada dokumen
Getting Started with a Java Project (Latihan Tugas Pemrograman).
*Push* solusi kamu **sebelum 5 Maret 2024 pukul 23.55**. Disarankan untuk
*push* **sebelum pukul 22.00** untuk mengantisipasi antrean pada GitHub
Pipelines.

Jangan lupa untuk menambahkan asdos kamu dan dekdepe sebagai *member* di repositori kamu.
Tim pengajar hanya akan menilai pekerjaan kamu berdasarkan ***commit* terbaru**
yang **sudah di-*push* sebelum waktu dan tanggal yang ditentukan**. *Commit*
tersebut diidentifikasi dengan memeriksa GitHub Pipelines.

> Catatan: *timestamp* pada GitHub Pipelines tidak pernah bohong.
> *So, no funny business, please :)*

## Daftar pekerjaan

### Daftar pekerjaan wajib

- [ ] Buat sekurang-kurangnya 1 *commit* yang mengandung progres kamu dalam
  mengerjakan Tugas Pemrograman 1.
- [ ] *Push* *commit* kamu ke repositori Git *online* yang ada pada proyek
  GitHub kamu.
- [ ] Implementasikan method `generateId` dengan benar.
- [ ] Implementasikan method `generateNota` dengan benar.
- [ ] Demonstrasikan program kamu ke asdos kamu.

## Penilaian

- 25% Fungsionalitas method generateOrderID (Generate Order ID)
- 25% Fungsionalitas method generateBill (Generate Bill)
- 10% Implementasi Menu Utama (Menu Utama)
- 5% Dokumentasi (kejelasan kode)
- 5% Standar penulisan kode (kerapian kode)
- 30% Demo program dengan asisten dosen