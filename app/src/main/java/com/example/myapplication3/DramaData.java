package com.example.myapplication3;

import java.util.ArrayList;

public class DramaData {
    private static String[] nama = new String[]{
            "Doctor John",
            "Hotel Del Luna",
            "Iteawon Class",
            "It's Okay To Not Be Okay",
            "Mr. Queen",
            "The Myth",
            "Penthouse",
            "Start Up",
            "True Beauty",
            "Vincenzo"
    };

    private static int[] thumbnail = new int[]{
            R.drawable.doctorjohn,
            R.drawable.hoteldelluna,
            R.drawable.iteawonclass,
            R.drawable.itsokay,
            R.drawable.mrqueen,
            R.drawable.myth,
            R.drawable.penthouse,
            R.drawable.startup,
            R.drawable.truebeauty,
            R.drawable.vincenzo
    };

    private static String[] deskripsi = new String[] {
            "Cha Yo-Han (Ji Sung) adalah seorang dokter anestesiologi. Dia arogan tetapi jenius dalam pekerjaannya. Kang Shi-Young (Lee Se-Young) adalah residen anestesiologi yang bekerja dengan Cha Yo-Han. Ia cerdas, hangat, dan pendengar yang baik terhadap pasiennya. Orang-orang menderita rasa sakit akut maupun kronis yang misterius datang ke rumah sakit. Di sana, Cha Yo-Han dan Kang Shi-Young mencoba mencari penyebab rasa sakit mereka.",
            "Hotel Del Luna yang berlokasi di Seoul, tidak seperti hotel lain: semua tamunya adalah hantu. Jang Man-wol (Lee Ji-eun), yang terjebak di hotel tersebut selama bertahun-tahun, bertemu dengan Goo Chan-seong (Yeo Jin-goo), seorang manajer hotel baru. Bersama-sama mereka akan membuka rahasia kelam yang telah lama terpendam yang membuat Jang Man-wol terjebak di Hotel Del Luna selama 1.300 tahun.",
            "Itaewon Class menceritakan tetang mantan terpidana Park Sae-roy (Park Seo-joon) yang hidupnya telah terbalik setelah ia dikeluarkan dari sekolah karena meninju perundung, dan ayahnya terbunuh dalam suatu kecelakaan. Mengikuti langkah-langkah ayahnya, ia membuka restoran bar DanBam di Itaewon dan bersama dengan manajer dan stafnya, berusaha keras menuju kesuksesan dan mencapai tingkat yang lebih tinggi.",
            "Moon Gang-tae (Kim Soo-hyun), seorang pekerja kesehatan komunitas di bangsal psikiatri yang tidak punya waktu untuk cinta dan Ko Moon-young (Seo Yea-ji), seorang penulis buku anak-anak sukses yang menderita gangguan kepribadian antisosial dan tidak pernah mengenal cinta. Setelah bertemu, keduanya perlahan mulai menyembuhkan luka emosional satu sama lain. Di sepanjang serinya, hal lain juga mulai terungkap tentang kebenaran masa lalu mereka yang telah menghantui hidup mereka.",
            "Pada era modern, Jang Bong-hwan bekerja sebagai koki di Rumah Biru Presiden. Dia memiliki jiwa yang bebas, tetapi entah bagaimana jiwanya menemukan jalan ke dalam tubuh Ratu Cheorin (Shin Hye-sun) pada periode Joseon. Raja Cheoljong (Kim Jung-hyun) adalah orang yang lembut dan santai secara lahiriah tetapi memiliki sisi yang berbeda juga. Ratu Sunwon (Bae Jong-ok) adalah istri almarhum Raja Sunjo yang memegang kekuasaan sejati di negara itu dan menjadikan Raja Cheoljong sebagai raja boneka. Kim Jwa-geun (Kim Tae-woo) adalah adik yang ambisius dari Ratu Sunwon.",
            "Bercerita tentang seorang insinyur jenius bernama Han Tae-sul (Cho Seung-woo) yang mencoba mengungkap kebenaran di balik kematian kakak laki-lakinya, dan seorang pejuang elit bernama Kang Seo-hae (Park Shin-hye) yang melakukan perjalanan kembali ke masa lalu untuk membantunya.",
            "Sebuah penthouse mewah berlokasi di Gangnam, memiliki suasana yang tegang di antara penghuninya yang beragam. Kalangan elegan yang lahir dari masyarakat kelas atas hingga pendaki sosial yang ambisius, masing-masing berusaha untuk mencapai puncak, baik dalam kekayaan, status, maupun pendidikan anak-anak mereka.",
            "Start-Up berlatar belakang di kawasan fiksi Korea Selatan Silicon Valley yang disebut Sandbox dan menceritakan kisah orang-orang di dunia perusahaan startup.",
            "Im Ju-gyeong (Moon Ga-young) adalah seorang siswi SMA yang menjadi terkenal sebagai gadis cantik setelah menguasai seni rias dari YouTube. Dia berubah menjadi dewi karena keterampilan rias wajahnya, tetapi ia lebih memilih mati daripada menunjukkan wajahnya tanpa riasan kepada siapa pun. Sedangkan Lee Su-ho (Cha Eun-woo) adalah anak laki-laki yang menarik dan tampan yang tampak dingin karena masa lalunya yang kelam, tetapi sebenarnya sangat perhatian. Mereka bertemu satu sama lain untuk berbagi rahasia dan menemukan cinta satu sama lain, tetapi dapatkah Su-ho membuat Ju-gyeong menemukan kecantikan sejatinya?",
            "Pada usia delapan tahun, Park Joo-hyung (Song Joong-ki) pergi ke Italia setelah diadopsi oleh Don Fabio, kepala keluarga mafia Cassano. Berganti nama menjadi Vincenzo Cassano, dia menjadi pengacara Italia, seorang consigliere untuk mafia, dan salah satu orang terbaik Fabio sampai kematiannya. Setelah Fabio meninggal, Paolo (putra kandung dan pemimpin baru Fabio) mencoba membunuhnya; dia melarikan diri ke Seoul untuk mendapatkan emas tersembunyi di dalam Kompleks Apartemen Geumga-dong. Vincenzo membantu seorang hartawan asal Tiongkok menyembunyikan emasnya di lemari besi yang diamankan mafia di dalam kompleks tersebut, tetapi orang tersebut meninggal. Tanpa ada yang tahu tentang lemari besi itu, dia berencana untuk mengambil emas itu dan menggunakannya sebagai dana pensiunnya setelah meninggalkan Italia dan mafia. Namun, sebuah perusahaan real estate di bawah Babel Group telah secara ilegal mengambil alih kepemilikan gedung tersebut dan Vincenzo harus menggunakan keahliannya untuk merebut kembali gedung tersebut dan memulihkan kekayaannya. Vincenzo terlibat dengan pengacara Hong Cha-young (Jeon Yeo-been), tipe pengacara yang akan melakukan apa saja untuk memenangkan kasus. Vincenzo Cassano jatuh cinta padanya. Dia juga mencapai keadilan sosial dengan caranya sendiri."

    };



    static ArrayList<DramaModel> getListData(){
        DramaModel dramaModel = null;
        ArrayList<DramaModel> list = new ArrayList<>();
        for (int i = 0; i<nama.length; i++) {
            dramaModel = new DramaModel();
            dramaModel.setNamaDrama(nama[i]);
            dramaModel.setGambarDrama(thumbnail[i]);
            dramaModel.setDeskripsiDrama(deskripsi[i]);
            list.add(dramaModel);
        }
        return list;
    }
}

