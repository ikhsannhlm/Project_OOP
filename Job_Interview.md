# 1
Dalam masalah ini, kita memiliki beberapa langkah yang harus dilakukan:

1. Meminta input username dari pengguna untuk personal chat.
2. Mengecek apakah username tersebut ada dalam daftar user yang tersedia.
3. Jika username ditemukan, meminta pengguna untuk memasukkan pesan yang akan dikirimkan.
4. Mengirimkan pesan personal kepada pengguna dengan username yang sesuai.
5. Jika username tidak ditemukan, menampilkan pesan bahwa username tidak ditemukan.

Berikut adalah pendekatan matematika dan algoritma pemrograman yang tepat untuk menyelesaikan masalah ini:

1. Meminta input username dari pengguna untuk personal chat.
2. Mengecek apakah username tersebut ada dalam daftar user yang tersedia.
   - Iterasi melalui daftar user yang ada.
   - Bandingkan username yang dimasukkan dengan username dalam daftar user.
   - Jika ditemukan, lanjutkan ke langkah 3.
   - Jika tidak ditemukan, lanjutkan ke langkah 5.
3. Meminta pengguna untuk memasukkan pesan yang akan dikirimkan.
4. Mengirimkan pesan personal kepada pengguna dengan username yang sesuai.
   - Temukan objek user yang sesuai berdasarkan username.
   - Buat objek pesan dengan isi yang dimasukkan.
   - Kirim pesan tersebut kepada objek user.
5. Jika username tidak ditemukan, tampilkan pesan bahwa username tidak ditemukan.
6. Kembali ke menu chat.

Berikut adalah implementasi kode yang mengikuti pendekatan di atas:

```java
case 1:
    boolean loop1 = true;
    do {
        System.out.println("New Personal Chat");
        System.out.print("Username: ");
        String username = input.nextLine();
        
        // Mencari user berdasarkan username
        User user = null;
        for (User u : userList) {
            if (u.getUsername().equals(username)) {
                user = u;
                break;
            }
        }
        
        if (user != null) {
            System.out.print("Message: ");
            String message = input.nextLine();
            
            // Mengirim pesan personal
            PersonalMessage personalMessage = new PersonalMessage(currentUser, message);
            user.receiveMessage(personalMessage);
        } else {
            System.out.println("Username not found. Please enter a valid contact username.");
        }
        
        System.out.print("Chat with another user? (Y/N): ");
        String option1 = input.nextLine();
        if (option1.equalsIgnoreCase("N")) {
            loop1 = false;
        }
    } while (loop1);
    break;
```

Dalam implementasi di atas, kita menggunakan perulangan `for` untuk mencari user yang sesuai berdasarkan username yang dimasukkan oleh pengguna. Jika ditemukan, pesan personal dibuat dengan menggunakan objek `PersonalMessage` yang berisi pengguna yang sedang aktif (`currentUser`) dan isi pesan yang dimasukkan oleh pengguna. Pesan tersebut kemudian dikirim ke user yang sesuai melalui metode `receiveMessage`. Jika username tidak ditemukan, pesan "Username not found" akan ditampilkan.

# 2
Berikut adalah penjelasan algoritma dari solusi yang dibuat:

1. Pertama, kita meminta pengguna untuk memasukkan username untuk personal chat.
2. Selanjutnya, kita melakukan iterasi melalui daftar user yang tersedia.
3. Pada setiap iterasi, kita membandingkan username yang dimasukkan oleh pengguna dengan username dari user saat ini.
4. Jika username yang dimasukkan cocok dengan username dari user saat ini, itu berarti kita telah menemukan user yang sesuai.
5. Selanjutnya, kita meminta pengguna untuk memasukkan pesan yang akan dikirimkan.
6. Setelah pengguna memasukkan pesan, kita membuat objek `PersonalMessage` yang berisi pengguna yang sedang aktif (`currentUser`) dan isi pesan yang dimasukkan oleh pengguna.
7. Kita kemudian mengirim pesan tersebut ke user yang sesuai dengan menggunakan metode `receiveMessage` pada objek user.
8. Jika tidak ada username yang cocok dengan yang dimasukkan oleh pengguna, kita tampilkan pesan "Username not found".
9. Terakhir, kita memberikan opsi kepada pengguna untuk melanjutkan chat dengan user lain atau kembali ke menu chat.
10. Langkah-langkah di atas diulang sampai pengguna memilih untuk berhenti.

Algoritma tersebut memastikan bahwa pesan personal dikirim hanya kepada user yang sesuai berdasarkan username yang dimasukkan oleh pengguna. Jika username tidak ditemukan, pesan "Username not found" akan ditampilkan agar pengguna mendapatkan umpan balik yang sesuai.

# 3
Konsep dasar OOP (Object-Oriented Programming) adalah pendekatan dalam pemrograman yang berfokus pada objek sebagai unit dasar yang memiliki atribut dan perilaku tertentu. OOP menyediakan seperangkat konsep dan prinsip yang memungkinkan pengorganisasian, pemodelan, dan pengembangan perangkat lunak yang lebih efisien dan terstruktur.

Berikut adalah konsep dasar OOP:

1. Objek: Objek adalah instansi konkret dari suatu kelas yang memiliki atribut (data) dan metode (perilaku) yang terkait. Objek merepresentasikan entitas nyata atau konsep abstrak dalam program.

2. Kelas: Kelas adalah blueprint atau template untuk membuat objek. Kelas mendefinisikan struktur dan perilaku objek dengan menentukan atribut (variabel) dan metode (fungsi) yang dimiliki oleh objek.

3. Enkapsulasi: Enkapsulasi adalah konsep untuk menyembunyikan detail implementasi dari luar dunia objek. Ini berarti data (atribut) dan metode (perilaku) yang terkait dengan objek dibungkus bersama dalam kelas, dan hanya akses terbatas yang diberikan ke data dan metode tersebut.

4. Pewarisan: Pewarisan memungkinkan kelas baru (kelas turunan) untuk mewarisi atribut dan metode dari kelas yang sudah ada (kelas induk atau superclass). Hal ini memungkinkan untuk membuat hierarki kelas dan membagikan dan mewarisi fungsionalitas antar kelas.

5. Polimorfisme: Polimorfisme memungkinkan penggunaan metode dengan nama yang sama namun dengan perilaku yang berbeda dalam konteks yang berbeda. Ini dapat dicapai melalui penggunaan overriding (penimpaan metode dalam kelas turunan) dan overloading (mendefinisikan metode dengan nama yang sama tetapi dengan parameter yang berbeda).

6. Abstraksi: Abstraksi adalah konsep untuk menyembunyikan detail kompleks dan hanya mengekspos fungsionalitas yang relevan dan penting. Ini dilakukan dengan menggunakan kelas abstrak dan antarmuka untuk mendefinisikan perilaku umum yang diharapkan dari objek.

Konsep dasar OOP ini membantu dalam pengembangan perangkat lunak yang modular, terstruktur, dan mudah dimengerti. OOP juga mempromosikan pemisahan tanggung jawab (responsibility) dan modularitas yang memungkinkan pengembangan yang lebih efisien, pemeliharaan yang lebih mudah, dan peningkatan kemampuan untuk mengelola kompleksitas dalam perangkat lunak.

# 4
Dalam program yang telah dibuat, kita dapat menggambarkan penggunaan konsep enkapsulasi dengan menerapkan aksesibilitas yang tepat pada atribut dan metode dalam kelas-kelas yang terlibat. Berikut adalah contoh penggunaan enkapsulasi dalam program tersebut:

1. Kelas User:
   - Atribut `username` dan `number` dienkapsulasi dengan menggunakan aksesibilitas private. Ini berarti atribut-atribut tersebut hanya dapat diakses oleh metode-metode dalam kelas User itu sendiri.
   - Metode `getUsername()` dan `getNumber()` diimplementasikan untuk memberikan akses hanya untuk membaca nilai atribut `username` dan `number`. Metode-metode ini menggunakan aksesibilitas public sehingga dapat diakses dari kelas lain.
   - Metode `addContact()` diimplementasikan untuk menambahkan objek User ke dalam daftar kontak pengguna saat ini. Metode ini menggunakan aksesibilitas public untuk memungkinkan akses dari luar kelas User.
   - Metode `displayContactList()` diimplementasikan untuk menampilkan daftar kontak pengguna saat ini. Metode ini menggunakan aksesibilitas public untuk memungkinkan akses dari luar kelas User.

2. Kelas CurrentUser:
   - Kelas ini merupakan turunan dari kelas User. Dalam kelas ini, kita dapat menerapkan konsep enkapsulasi dengan memanfaatkan metode-metode yang diwarisi dari kelas User.
   - Metode `displayReceivedChat()` diimplementasikan untuk menampilkan daftar obyek Chat yang diterima oleh pengguna saat ini. Metode ini menggunakan aksesibilitas public untuk memungkinkan akses dari luar kelas CurrentUser.

Dengan menerapkan aksesibilitas yang tepat pada atribut dan metode, kita memastikan bahwa atribut-atribut yang sensitif seperti `username` dan `number` hanya dapat diakses melalui metode-metode yang ditentukan dengan jelas. Ini memberikan lapisan abstraksi dan keamanan pada data pengguna dan mendorong penggunaan metode-metode yang ditentukan untuk memanipulasi dan mengakses data tersebut.

Contoh penggunaan enkapsulasi dalam program tersebut dapat dilihat pada implementasi metode-metode seperti `getUsername()`, `getNumber()`, `addContact()`, dan `displayContactList()`. Atribut-atribut yang dienkapsulasi hanya dapat diakses melalui metode-metode ini, sedangkan detail implementasi dan representasi internal atribut disembunyikan dari kelas-kelas lain yang menggunakan kelas User dan CurrentUser.

# 5
Dalam program yang telah dibuat, kita dapat menggambarkan penggunaan konsep abstraksi dengan memanfaatkan kelas abstrak dan metode abstrak. Berikut adalah contoh penggunaan abstraksi dalam program tersebut:

1. Kelas User:
   - Kelas User dapat dianggap sebagai kelas abstrak yang menggambarkan entitas dasar pengguna dengan atribut dan metode yang terkait.
   - Metode `displayContactList()` dalam kelas User adalah metode abstrak yang belum diimplementasikan secara spesifik dalam kelas User. Metode ini memberikan sebuah abstraksi bahwa setiap turunan dari kelas User harus mengimplementasikan metode ini sesuai dengan kebutuhan spesifiknya.

2. Kelas CurrentUser:
   - Kelas CurrentUser adalah turunan dari kelas User dan mengimplementasikan metode `displayContactList()` yang telah dideklarasikan sebagai metode abstrak dalam kelas User. Ini menjadikan kelas CurrentUser sebagai kelas konkret yang memberikan implementasi spesifik untuk metode `displayContactList()`.
   - Metode `displayContactList()` dalam kelas CurrentUser memberikan implementasi konkret untuk menampilkan daftar kontak pengguna saat ini.

Dengan menerapkan konsep abstraksi, kita membuat kerangka umum (kelas User) yang mendefinisikan atribut dan metode yang diperlukan untuk entitas pengguna secara umum. Kemudian, kelas turunan (kelas CurrentUser) memberikan implementasi spesifik untuk metode yang dideklarasikan sebagai metode abstrak dalam kelas User. Dengan demikian, kita mencapai tingkat abstraksi yang lebih tinggi dengan memisahkan detail implementasi dari representasi konseptual yang lebih umum.

Contoh penggunaan abstraksi dalam program tersebut dapat dilihat dari penggunaan kelas abstrak User dan implementasi konkret metode `displayContactList()` dalam kelas CurrentUser. Melalui abstraksi, kita fokus pada konsep pengguna dan interaksi dengan daftar kontak, tanpa terlalu memperhatikan detail implementasi yang spesifik pada tingkat yang lebih rendah.

# 6
Dalam program yang telah dibuat, kita dapat menggambarkan penggunaan konsep inheritance dan polymorphism sebagai berikut:

1. Inheritance (Pewarisan):
   - Kelas `CurrentUser` merupakan turunan dari kelas `User`. Hal ini menunjukkan bahwa `CurrentUser` mewarisi atribut dan metode yang didefinisikan dalam kelas `User`.
   - Dengan pewarisan, kelas `CurrentUser` dapat memanfaatkan dan mengakses atribut dan metode yang sudah ada dalam kelas `User` tanpa perlu mendefinisikannya kembali. Misalnya, `CurrentUser` dapat menggunakan metode `addContact()` yang telah didefinisikan dalam kelas `User` untuk menambahkan kontak baru.

2. Polymorphism (Polimorfisme):
   - Metode `displayContactList()` yang didefinisikan dalam kelas `User` dan diimplementasikan dalam kelas `CurrentUser` menunjukkan polimorfisme.
   - Polimorfisme memungkinkan objek dari kelas yang berbeda (namun terkait dalam hierarki pewarisan) untuk merespons metode yang sama dengan cara yang sesuai dengan implementasi masing-masing kelas.
   - Dalam hal ini, ketika metode `displayContactList()` dipanggil pada objek `CurrentUser`, metode tersebut akan dieksekusi sesuai dengan implementasi yang diberikan dalam kelas `CurrentUser`. Ini memungkinkan kelas `CurrentUser` untuk memberikan implementasi yang sesuai dengan kebutuhan spesifiknya.

Contoh penggunaan inheritance dan polymorphism dalam program tersebut dapat dilihat dari pewarisan antara kelas `CurrentUser` dan `User`, di mana `CurrentUser` mewarisi atribut dan metode dari `User`. Selain itu, polimorfisme terjadi saat metode `displayContactList()` dipanggil pada objek `CurrentUser`, di mana implementasi konkret dalam kelas `CurrentUser` akan dieksekusi.

Penggunaan konsep inheritance memungkinkan kita untuk memanfaatkan kembali kode yang sudah ada, sementara polimorfisme memungkinkan kita untuk menggunakan objek dengan cara yang tepat untuk setiap kelas dalam hierarki pewarisan.

# 7
Berikut adalah contoh tabel use case dalam format file .md:

| Use Case ID | Nama Use Case      | Deskripsi                                   | Point | Status |
|-------------|-------------------|---------------------------------------------|-------|--------|
| UC-001      | Kirim Pesan       | Pengguna dapat mengirim pesan ke pengguna lain. | 10 | Complete |
| UC-002      | Buat Grup         | Pengguna dapat membuat grup dan menambahkan anggota ke dalam grup. | 9 | Complete |
| UC-003      | Tambah Kontak     | Pengguna dapat menambahkan kontak baru ke dalam daftar kontak. | 8 | Complete |
| UC-004      | Kirim Broadcast   | Pengguna dapat mengirim pesan broadcast ke beberapa pengguna sekaligus. | 8 | Uncomplete |
| UC-005      | Tampilkan Chat    | Pengguna dapat melihat daftar percakapan yang tersedia. | 8 | Complete |
| UC-006      | Pin Chat          | Pengguna dapat mem-pin percakapan penting untuk memudahkan akses. | 7 | Uncomplete |
| UC-007      | Bintang Chat      | Pengguna dapat memberikan tanda bintang pada pesan yang penting. | 6 | Complete |
| UC-008      | Arsipkan Chat     | Pengguna dapat mengarsipkan percakapan untuk menyimpannya secara terpisah. | 5 | Uncomplete |
| UC-009      | Hapus Chat        | Pengguna dapat menghapus percakapan dari daftar chat. | 8 | Complete |
| UC-010      | Buka Kamera       | Pengguna dapat membuka kamera untuk mengambil foto atau video. | 6 | Uncomplete |
| UC-011      | Cari Sesuatu      | Pengguna dapat melakukan pencarian pada chat dan kontak. | 6 | Uncomplete |
| UC-012      | Kembali ke Menu Utama | Pengguna dapat kembali ke menu utama aplikasi. | 8 | Uncomplete |

# 8
```mermaid
User <|-- Group
CurrentUser "1" -- "1" User
MainMenu "1" -- "1" CurrentUser
ChatMenu "1" -- "1" CurrentUser
ChatMessage "1" -- "1" User

class User {
  - username: String
  - phoneNumber: String
  + User(username: String, phoneNumber: String)
  + getUsername(): String
  + getPhoneNumber(): String
  + addContact(user: User): void
  + getContactByUsername(username: String): User
  + displayContactList(): void
  + displayReceivedChat(): void
}

class Group {
  - groupName: String
  - members: List<User>
  + Group(groupName: String)
  + getGroupName(): String
  + addMember(user: User): void
  + getMembers(): List<User>
}

class CurrentUser {
  - currentUser: User
  + getCurrentUser(): User
  + setCurrentUser(user: User): void
}

class MainMenu {
  - currentUser: CurrentUser
  - userList: List<User>
  + MainMenu(userList: List<User>)
  + showMainMenu(): void
  + processChoice(choice: short): void
}

class ChatMenu {
  - currentUser: CurrentUser
  - userList: List<User>
  + ChatMenu(currentUser: CurrentUser, userList: List<User>)
  + showChatMenu(): void
  + processChoice(choice: short): void
}

class ChatMessage {
  - sender: User
  - receiver: User
  - message: String
  - timestamp: Date
  + ChatMessage(sender: User, receiver: User, message: String)
  + getSender(): User
  + getReceiver(): User
  + getMessage(): String
  + getTimestamp(): Date
}
```

# 9
Link Yt menyusul

# 10
Menyusul
