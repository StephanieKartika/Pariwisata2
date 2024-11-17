package com.example.pariwisata;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class detailactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailactivity);

        // Menampilkan Toast
        Toast.makeText(this, "Anda sedang melihat detail tempat wisata", Toast.LENGTH_SHORT).show();

        // Menghubungkan views dengan ID di XML
        ImageView detailImage = findViewById(R.id.detailImage);
        TextView detailName = findViewById(R.id.detailName);
        TextView detailLocation = findViewById(R.id.detailLocation);
        TextView detailDescription = findViewById(R.id.detailDescription);
        Button buttonBack = findViewById(R.id.buttonBack);

        // Mendapatkan data dari intent
        Intent intent = getIntent();
        String placeName = intent.getStringExtra("placeName");
        String placeLocation = intent.getStringExtra("placeLocation");
        int placeImage = intent.getIntExtra("placeImage", 0);

        // Menampilkan data di layout
        detailImage.setImageResource(placeImage);
        detailName.setText(placeName);
        detailLocation.setText(placeLocation);

        // Menambahkan deskripsi menggunakan switch
        String description;
        switch (placeName) {
            case "Bromo":
                description = " Gunung Bromo, yang terletak di Taman Nasional Bromo Tengger Semeru, Jawa Timur, adalah salah satu gunung berapi paling terkenal di Indonesia. Keindahan alam di sekitar Gunung Bromo, terutama saat matahari terbit, membuatnya menjadi salah satu destinasi wisata paling ikonik di Indonesia. Pemandangan luas padang pasir yang dipenuhi kabut, ditambah dengan latar belakang gunung berapi yang mengeluarkan asap, menciptakan pemandangan yang dramatis dan magis.\n" +
                        "\n" +
                        "Selain keindahan alamnya, Gunung Bromo juga memiliki makna budaya yang dalam bagi masyarakat Tengger yang tinggal di sekitar kaki gunung. Setiap tahun, masyarakat Tengger mengadakan upacara Kasada di kawah Bromo sebagai bentuk penghormatan kepada dewa-dewa yang mereka percayai. Pengunjung dapat menyaksikan upacara ini dan belajar tentang tradisi serta kepercayaan lokal yang sudah berlangsung lama.\n" +
                        "\n" +
                        "Untuk mencapai puncak Bromo, pengunjung dapat naik dengan kendaraan jeep yang sudah disediakan, atau melakukan pendakian ringan melalui lautan pasir. Begitu tiba di puncak, pengunjung akan disuguhkan dengan pemandangan yang luar biasa indah, terutama saat matahari terbit, yang menjadi momen terbaik untuk menikmati pesona Gunung Bromo. Gunung Bromo merupakan destinasi yang memadukan keindahan alam, petualangan, dan kekayaan budaya, menjadikannya tempat yang wajib dikunjungi bagi para pencinta alam dan wisatawan yang ingin merasakan pengalaman yang berbeda..";
                break;
            case "Taman Nasional Baluran":
                description = "Taman Nasional Baluran, yang terletak di ujung timur Pulau Jawa, dikenal sebagai \"Africa van Java\" karena lanskap savana yang mirip dengan Afrika. Taman ini memiliki beragam ekosistem, termasuk hutan tropis, hutan mangrove, dan savana, yang memberikan tempat hidup bagi berbagai spesies flora dan fauna. Salah satu daya tarik utama taman ini adalah savana yang luas, di mana pengunjung bisa melihat hewan-hewan seperti banteng, rusa, monyet, dan berbagai spesies burung liar.\n" +
                        "\n" +
                        "Taman Nasional Baluran juga menawarkan keindahan alam yang luar biasa, dengan pemandangan Gunung Baluran yang menjulang tinggi di tengah taman. Pengunjung dapat menjelajahi area taman melalui jalur-jalur trekking yang sudah disediakan atau melakukan safari untuk melihat kehidupan liar secara lebih dekat. Keindahan alam bawah laut di sekitar kawasan ini juga tak kalah menakjubkan, dengan pantai-pantai yang bersih dan terumbu karang yang masih alami.\n" +
                        "\n" +
                        "Selain sebagai tempat wisata alam, Taman Nasional Baluran juga berperan penting dalam konservasi flora dan fauna yang terancam punah. Pengunjung yang datang ke sini tidak hanya mendapatkan pengalaman petualangan di alam terbuka, tetapi juga belajar tentang pentingnya menjaga keseimbangan ekosistem dan melestarikan keanekaragaman hayati. Dengan pemandangan yang spektakuler dan keberagaman kehidupan alam, Taman Nasional Baluran merupakan destinasi yang tepat bagi para pecinta alam dan petualang.";
                break;
            case "Banda Neira":
                description = "Banda Neira adalah pulau yang terletak di Kepulauan Banda, Maluku, yang terkenal dengan sejarahnya yang kaya dan keindahan alam bawah lautnya. Pulau ini memiliki sejarah sebagai pusat perdagangan rempah-rempah, terutama pala, yang menjadi komoditas penting pada masa penjajahan Belanda. Anda bisa menemukan bangunan bersejarah, seperti benteng Belgica dan rumah-rumah kolonial yang masih terawat dengan baik, yang memberikan gambaran tentang masa kejayaan Banda Neira sebagai pusat perdagangan global.\n" +
                        "\n" +
                        "Keindahan alam Banda Neira sangat menonjol, terutama dengan pantai-pantainya yang indah dan perairan yang jernih, yang menawarkan pengalaman snorkeling dan diving yang luar biasa. Terumbu karang di sekitar pulau ini masih terjaga dengan baik dan menjadi habitat bagi berbagai spesies ikan dan biota laut lainnya. Selain itu, para wisatawan juga bisa mengunjungi Pulau Gunung Api yang aktif, yang menawarkan pemandangan vulkanik menakjubkan serta jalur pendakian yang menantang.\n" +
                        "\n" +
                        "Banda Neira juga merupakan destinasi bagi mereka yang ingin menikmati ketenangan dan jauh dari keramaian. Aktivitas di pulau ini lebih banyak berfokus pada wisata alam dan sejarah, serta menikmati kehidupan yang lebih sederhana. Di sini, pengunjung dapat merasakan keindahan alam tropis dan budaya lokal yang masih sangat kental, menjadikannya tempat yang sempurna untuk liburan yang lebih berfokus pada eksplorasi budaya dan alam.";
                break;
            case "Bedugul":
                description = "Bedugul adalah kawasan wisata yang terletak di daerah pegunungan Bali, yang dikenal dengan udara sejuk dan pemandangan alam yang memukau. Salah satu daya tarik utama di Bedugul adalah Danau Beratan, yang terletak di kaki Gunung Catur. Di tengah danau ini, terdapat Pura Ulun Danu, sebuah pura yang sangat terkenal dan menjadi ikon dari kawasan Bedugul. Pura ini didedikasikan untuk Dewi Danu, dewi danau dan kesuburan dalam kepercayaan Hindu Bali.\n" +
                        "\n" +
                        "Selain Pura Ulun Danu, Bedugul juga dikenal dengan kebun raya yang luas dan berbagai taman bunga yang menambah keindahan kawasan ini. Kebun Raya Bedugul menawarkan udara segar dan berbagai koleksi tanaman tropis yang langka, serta pemandangan indah pegunungan yang mengelilinginya. Tempat ini sangat cocok untuk mereka yang ingin menikmati keindahan alam Bali dalam suasana yang lebih sejuk dan damai.\n" +
                        "\n" +
                        "Bedugul juga merupakan tempat yang tepat untuk menikmati berbagai aktivitas alam, seperti trekking, berperahu di danau, atau sekadar bersantai menikmati pemandangan alam yang asri. Dengan udara yang sejuk dan pemandangan yang menakjubkan, Bedugul menjadi salah satu destinasi favorit bagi wisatawan yang ingin menikmati suasana Bali yang lebih tenang dan alami, jauh dari hiruk-pikuk kehidupan kota..";
                break;
            case "Candi Borobudur":
                description = " Candi Borobudur, yang terletak di Magelang, Jawa Tengah, adalah salah satu situs warisan dunia yang paling terkenal di Indonesia. Candi ini dibangun pada abad ke-9 oleh dinasti Syailendra dan merupakan candi Buddha terbesar di dunia. Borobudur memiliki arsitektur yang luar biasa, dengan sembilan tingkat yang dihiasi dengan relief-relief indah yang menggambarkan kisah hidup Buddha. Setiap relief di Borobudur memiliki makna filosofis yang mendalam, yang mengajarkan ajaran-ajaran moral dan spiritual.\n" +
                        "\n" +
                        "Selain keindahan arsitektur dan relief, Candi Borobudur juga menawarkan pemandangan yang memukau, terutama saat matahari terbit. Dari puncak candi, pengunjung dapat menikmati panorama hijau pegunungan yang mengelilingi kawasan tersebut, menciptakan suasana yang magis dan penuh kedamaian. Setiap tahun, ribuan wisatawan datang ke Borobudur untuk menikmati keindahan budaya dan alam yang ditawarkan.\n" +
                        "\n" +
                        "Candi Borobudur tidak hanya menjadi destinasi wisata sejarah, tetapi juga pusat pembelajaran dan meditasi bagi banyak pengunjung. Aktivitas seperti meditasi atau tur berpemandu memberikan kesempatan untuk lebih memahami makna spiritual dari candi ini. Sebagai situs warisan dunia, Borobudur menjadi simbol kekayaan budaya Indonesia dan merupakan salah satu destinasi yang wajib dikunjungi oleh wisatawan yang tertarik dengan sejarah, budaya, dan spiritualitas..";
                break;
            case "Kawah Ijen":
                description = "Kawah Ijen, yang terletak di perbatasan antara Banyuwangi dan Bondowoso, Jawa Timur, terkenal dengan fenomena api biru yang hanya dapat ditemukan di beberapa tempat di dunia. Kawah ini merupakan tempat yang sangat menarik bagi para penggemar alam dan petualangan. Fenomena api biru yang muncul pada malam hari disebabkan oleh pembakaran gas belerang yang keluar dari dalam kawah, menciptakan pemandangan yang luar biasa spektakuler.\n" +
                        "\n" +
                        "Selain api biru, Kawah Ijen juga memiliki keindahan alam yang luar biasa, dengan danau kawah yang berwarna hijau kebiruan dan pemandangan pegunungan yang mengelilinginya. Untuk mencapai kawah, pengunjung harus mendaki gunung Ijen, yang memakan waktu sekitar 2-3 jam. Meskipun perjalanan menuju puncak cukup menantang, pemandangan yang didapat saat sampai di kawah akan sangat sebanding dengan usaha yang dikeluarkan.\n" +
                        "\n" +
                        "Kawah Ijen juga terkenal dengan aktivitas penambangan belerang yang masih dilakukan oleh para penambang lokal. Pengunjung dapat menyaksikan para penambang yang bekerja di tepi kawah, membawa belerang dalam jumlah besar meskipun dengan peralatan yang sederhana. Pengalaman ini memberikan wawasan yang mendalam tentang kehidupan penambang serta tantangan yang mereka hadapi dalam bekerja di lingkungan yang keras. Kawah Ijen adalah tempat yang sangat menarik bagi mereka yang mencari petualangan dan ingin menyaksikan fenomena alam yang luar biasa..";
                break;
            case "Kelingking Beach":
                description = "Kelingking Beach, yang terletak di Pulau Nusa Penida, Bali, dikenal dengan pemandangan yang sangat menakjubkan. Nama \"Kelingking\" berasal dari bentuk tebing yang mirip dengan jari kelingking, yang menjulang tinggi di atas pantai. Dari atas tebing, pengunjung bisa menikmati pemandangan laut biru yang jernih, pasir putih, dan tebing-tebing curam yang membentuk lanskap unik. Keindahan alam yang menakjubkan membuat Kelingking Beach menjadi salah satu destinasi wisata yang paling terkenal di Bali.\n" +
                        "\n" +
                        "Untuk mencapai pantai ini, pengunjung harus menuruni tangga yang curam dan cukup menantang. Meskipun akses ke pantai ini cukup sulit, pemandangan yang didapat di bawah sangat sebanding dengan usaha yang dikeluarkan. Pasir putih yang lembut dan air laut yang jernih sangat ideal untuk berenang atau hanya bersantai menikmati alam. Keindahan bawah laut di sekitar pantai juga menjadikannya tempat yang populer untuk snorkeling.\n" +
                        "\n" +
                        "Selain menikmati pantai, wisatawan dapat mendaki ke atas tebing untuk melihat pemandangan yang lebih luas dari seluruh kawasan sekitar Kelingking Beach. Di sini, Anda dapat menikmati panorama alam yang menakjubkan, terutama saat matahari terbenam. Kelingking Beach adalah tempat yang sempurna untuk petualangan dan fotografi, sekaligus menawarkan ketenangan jauh dari keramaian.";
                break;
            case "Pulau Padar":
                description = "Pulau Padar adalah pulau yang terletak di Taman Nasional Komodo, Nusa Tenggara Timur, yang terkenal dengan pemandangan alamnya yang spektakuler. Pulau ini memiliki pemandangan perbukitan yang berbentuk unik, dengan pantai-pantai yang tersembunyi di antara bukit-bukit tersebut. Salah satu daya tarik utama Pulau Padar adalah trekking menuju puncak bukit, di mana pengunjung akan disuguhkan dengan pemandangan 360 derajat yang menakjubkan, menghadap ke laut biru yang jernih dan pulau-pulau sekitarnya.\n" +
                        "\n" +
                        "Untuk mencapai puncak Pulau Padar, pengunjung harus melewati jalur pendakian yang cukup menantang, namun usaha tersebut akan terbayar dengan pemandangan yang luar biasa. Selama perjalanan, pengunjung akan melewati berbagai medan, dari bukit berbatu hingga hutan kecil, yang semakin menambah petualangan. Setelah mencapai puncak, pemandangan pulau yang terbentang luas di bawah akan membuat setiap langkah yang ditempuh terasa sangat berarti.\n" +
                        "\n" +
                        "Pulau Padar juga merupakan tempat yang sempurna untuk kegiatan fotografi, dengan lanskap alam yang sangat fotogenik. Keindahan alamnya yang alami dan suasana yang masih sangat murni membuat Pulau Padar menjadi destinasi yang sangat populer bagi para pecinta alam, fotografer, dan wisatawan yang ingin menikmati ketenangan jauh dari keramaian. Pulau ini menawarkan pengalaman yang tak terlupakan bagi siapa saja yang berkunjung.";
                break;
            case "Pink Beach":
                description = " Pink Beach, yang terletak di Pulau Komodo, Nusa Tenggara Timur, merupakan salah satu pantai paling unik di Indonesia. Pantai ini dikenal karena pasirnya yang berwarna pink, hasil dari campuran pasir putih dan serpihan terumbu karang merah yang hancur. Keunikan ini menjadikan Pink Beach sebagai salah satu tempat wisata yang sangat menarik bagi pengunjung yang ingin menikmati keindahan alam yang luar biasa. Air laut yang jernih dan terumbu karang yang masih terjaga dengan baik membuat pantai ini juga menjadi spot ideal untuk snorkeling dan diving.\n" +
                        "\n" +
                        "Keindahan alam di sekitar Pink Beach tidak hanya terbatas pada pantai dan laut, tetapi juga pada bukit-bukit yang mengelilingi pantai. Pengunjung bisa mendaki ke bukit untuk mendapatkan pemandangan panorama yang menakjubkan dari atas. Di sekitar pantai, Anda juga bisa menemukan banyak kehidupan laut, seperti ikan warna-warni, terumbu karang, dan berbagai jenis biota laut lainnya yang membuat pengalaman snorkeling semakin menarik.\n" +
                        "\n" +
                        "Selain aktivitas bawah laut, Pink Beach juga merupakan tempat yang sempurna untuk bersantai. Pantai yang masih alami dan tidak terlalu ramai memberikan suasana yang tenang dan damai. Pengunjung dapat menikmati waktu bersantai sambil menikmati pemandangan laut yang biru dan udara tropis yang sejuk. Pink Beach adalah destinasi yang wajib dikunjungi bagi siapa saja yang ingin merasakan keindahan alam Indonesia yang eksotis dan tak terlupakan..";
                break;
            case "Waerebo Village":
                description = "Desa Waerebo adalah sebuah desa adat yang terletak di Manggarai, Flores, Nusa Tenggara Timur. Desa ini terkenal dengan rumah adatnya yang unik, yaitu Mbaru Niang, rumah berbentuk kerucut yang terbuat dari bambu dan atap daun lontar. Masyarakat Waerebo masih mempertahankan tradisi dan cara hidup yang sangat dekat dengan alam. Desa ini terletak di ketinggian 1.200 meter di atas permukaan laut, di tengah pegunungan yang hijau dan dikelilingi oleh hutan tropis, memberikan pengalaman yang sangat berbeda bagi pengunjung.\n" +
                        "\n" +
                        "Perjalanan menuju Desa Waerebo cukup menantang, karena pengunjung harus mendaki melalui jalur hutan dan bukit yang curam. Meskipun perjalanan fisiknya cukup berat, pemandangan sepanjang perjalanan sangat mempesona, dan suasana di desa yang tenang dan alami akan membuat semua usaha terasa sepadan. Setelah sampai, pengunjung bisa merasakan kehidupan sehari-hari masyarakat Waerebo yang masih sangat bergantung pada pertanian dan kerajinan tangan.\n" +
                        "\n" +
                        "Desa Waerebo juga memiliki nilai budaya yang sangat tinggi, di mana tradisi dan adat istiadat masih sangat dihormati. Pengunjung yang datang dapat belajar tentang budaya Manggarai, termasuk sistem sosial, upacara adat, serta kepercayaan mereka terhadap leluhur. Desa ini juga menawarkan keindahan alam yang menakjubkan, dengan pemandangan pegunungan yang hijau dan udara yang sejuk, membuatnya menjadi destinasi yang ideal untuk berlibur sambil mengeksplorasi budaya lokal..";
                break;
            default:
                description = "Deskripsi tidak tersedia untuk tempat ini.";
                break;
        }


        // Menampilkan deskripsi
        detailDescription.setText(description);

        // Tombol kembali
        buttonBack.setOnClickListener(v -> finish());
    }
}
