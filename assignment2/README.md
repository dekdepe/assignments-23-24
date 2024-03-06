# Tugas Pemrograman 2: Objects & Classes
## Dasar-Dasar Pemrograman 2 @ Fakultas Ilmu Komputer Universitas Indonesia, Semester Genap 2023/2024

Tugas Pemrograman ini mencakup materi berikut:
- Objects
- Classes
- Manipulasi Array

### [Daftar Isi](#daftar-isi)
1. [Dokumen Soal](#dokumen-soal)
2. [Persiapan](#persiapan)
3. [Menjalankan dan Menguji Program](#menjalankan-dan-menguji-program)
4. [Pengumpulan](#pengumpulan)
5. [Daftar Pekerjaan](#daftar-pekerjaan)
   - [Daftar Pekerjaan Wajib](#daftar-pekerjaan-wajib)
6. [Penilaian](#penilaian)

### Dokumen Soal
Dokumen soal dapat diakses melalui [link ini](https://docs.google.com/document/d/1XumCjgGmYzGkK85ZnL9gJs16HM-QBIoEE8tn-95mSMI/edit?usp=sharing).

### Persiapan
Silakan ikuti persiapan yang ada pada berkas `README.md` di root repositori ini.

Template pengerjaan tugas ini disediakan di path `src\main\java\assignments\assignment2`

### Menjalankan dan Menguji Program
**Catatan:**
- Ubah `gradlew.bat` dengan `./gradlew` dan `\` dengan `/` jika kamu menggunakan Linux/Mac.
- Tanda `>` pada awal command tidak perlu ditulis. Digunakan sebagai pembeda antara command dan output-nya.

**Untuk menjalankan program:**
```bash
gradlew.bat :assignment2:run --console plain
```
**Alternatif tanpa Gradle:**
Jika kamu tidak ingin menggunakan Gradle, kamu juga bisa melakukan kompilasi dan menjalankan program dengan `javac` dan `java` seperti biasa. Masuk ke direktori `src\main\java`, compile semua berkas `.java` kamu, dan jalankan `MainMenu` class-nya.
```bash
cd src\main\java
javac assignments\assignment2\*.java
java assignments.assignment2.MainMenu
```
### Pengumpulan
Simpan pekerjaan kamu, lalu lakukan `git add`, `git commit`, dan `git push` sebagaimana dijelaskan pada dokumen *Getting Started with a Java Project* (Latihan Tugas Pemrograman). Push solusi kamu sebelum **17 Maret 2024 pukul 23.55**. Disarankan untuk push sebelum pukul 22.00 untuk mengantisipasi antrean pada GitHub Pipelines.

**Catatan:** Jangan lupa untuk menambahkan asdos kamu dan dekdepe sebagai member di repositori kamu.

### Daftar Pekerjaan
#### Daftar Pekerjaan Wajib
- [ ] Buat sekurang-kurangnya 2 commit yang mengandung progres kamu dalam mengerjakan Tugas Pemrograman 2.
- [ ] Push commit kamu ke repositori Git online yang ada pada proyek GitHub kamu.
- [ ] Implementasikan class `User` dengan benar.
- [ ] Implementasikan class `Restaurant` dengan benar.
- [ ] Implementasikan class `Order` dengan benar.
- [ ] Implementasikan class `Menu` dengan benar.
- [ ] Melengkapi fungsionalitas class `MainMenu` dengan benar.
- [ ] Demonstrasikan program kamu ke asdos kamu.

### Penilaian
- 10% Implementasi Class `User`
- 10% Implementasi Class `0rder`
- 40% Fungsionalitas Keseluruhan Program
- 5% Dokumentasi (kejelasan kode)
- 5% Standar penulisan kode (kerapian kode)
- 30% Demo program dengan asisten dosen
