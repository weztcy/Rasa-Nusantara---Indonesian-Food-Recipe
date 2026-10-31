package com.example.recipe.data;

import com.example.recipe.R;
import com.example.recipe.model.Recipe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecipeData {

    public static List<Recipe> getRecipeList() {

        List<Recipe> recipeList = new ArrayList<>();

        recipeList.add(new Recipe(
                1,
                "Nasi Goreng",
                R.drawable.nasi_goreng,
                "Nasi goreng sederhana dengan rasa gurih dan manis yang cocok untuk sarapan maupun makan malam.",
                "20 menit",
                "Mudah",
                Arrays.asList(
                        "1 piring nasi putih",
                        "1 butir telur",
                        "2 siung bawang putih",
                        "2 siung bawang merah",
                        "2 sdm kecap manis",
                        "1 batang daun bawang",
                        "Garam secukupnya",
                        "Merica secukupnya",
                        "Minyak goreng secukupnya"
                ),
                Arrays.asList(
                        "Iris bawang merah, bawang putih, dan daun bawang.",
                        "Panaskan sedikit minyak di dalam wajan.",
                        "Tumis bawang merah dan bawang putih hingga harum.",
                        "Masukkan telur kemudian orak-arik hingga matang.",
                        "Masukkan nasi putih lalu aduk hingga tercampur rata.",
                        "Tambahkan kecap manis, garam, dan merica.",
                        "Masukkan daun bawang lalu aduk kembali.",
                        "Masak beberapa menit kemudian sajikan."
                )
        ));

        recipeList.add(new Recipe(
                2,
                "Ayam Geprek",
                R.drawable.ayam_geprek,
                "Ayam goreng tepung yang disajikan dengan sambal bawang pedas dan gurih.",
                "40 menit",
                "Sedang",
                Arrays.asList(
                        "250 gram daging ayam",
                        "100 gram tepung terigu",
                        "50 gram tepung maizena",
                        "1 butir telur",
                        "5 buah cabai rawit merah",
                        "2 siung bawang putih",
                        "Garam secukupnya",
                        "Merica secukupnya",
                        "Minyak goreng secukupnya"
                ),
                Arrays.asList(
                        "Bumbui ayam dengan garam dan merica.",
                        "Campurkan tepung terigu dan tepung maizena.",
                        "Celupkan ayam ke dalam telur.",
                        "Balurkan ayam ke campuran tepung.",
                        "Goreng ayam hingga matang.",
                        "Haluskan cabai rawit, bawang putih, dan garam.",
                        "Tambahkan sedikit minyak panas ke sambal.",
                        "Geprek ayam bersama sambal kemudian sajikan."
                )
        ));

        recipeList.add(new Recipe(
                3,
                "Mie Goreng",
                R.drawable.mie_goreng,
                "Mie goreng praktis dengan tambahan telur dan sayuran yang mudah dibuat di rumah.",
                "15 menit",
                "Mudah",
                Arrays.asList(
                        "1 bungkus mie telur",
                        "1 butir telur",
                        "2 siung bawang putih",
                        "2 sdm kecap manis",
                        "1 batang daun bawang",
                        "50 gram sawi hijau",
                        "Garam secukupnya",
                        "Merica secukupnya"
                ),
                Arrays.asList(
                        "Rebus mie hingga setengah matang lalu tiriskan.",
                        "Tumis bawang putih hingga harum.",
                        "Masukkan telur lalu orak-arik.",
                        "Masukkan sawi.",
                        "Tambahkan mie.",
                        "Masukkan kecap, garam, dan merica.",
                        "Aduk hingga rata lalu sajikan."
                )
        ));

        recipeList.add(new Recipe(
                4,
                "Soto Ayam",
                R.drawable.soto_ayam,
                "Soto ayam berkuah kuning dengan cita rasa rempah yang hangat dan segar.",
                "60 menit",
                "Sedang",
                Arrays.asList(
                        "500 gram daging ayam",
                        "1 liter air",
                        "4 siung bawang putih",
                        "6 siung bawang merah",
                        "2 cm kunyit",
                        "2 cm jahe",
                        "2 batang serai",
                        "3 lembar daun jeruk",
                        "100 gram tauge",
                        "Garam secukupnya"
                ),
                Arrays.asList(
                        "Rebus ayam hingga matang.",
                        "Haluskan bawang putih, bawang merah, kunyit, dan jahe.",
                        "Tumis bumbu hingga harum.",
                        "Tambahkan serai dan daun jeruk.",
                        "Masukkan bumbu ke dalam air rebusan ayam.",
                        "Tambahkan garam.",
                        "Suwir daging ayam.",
                        "Susun ayam dan tauge di mangkuk.",
                        "Tuangkan kuah soto lalu sajikan."
                )
        ));

        recipeList.add(new Recipe(
                5,
                "Rendang",
                R.drawable.rendang,
                "Rendang daging sapi dengan santan dan rempah yang dimasak hingga bumbu meresap.",
                "120 menit",
                "Sulit",
                Arrays.asList(
                        "500 gram daging sapi",
                        "500 ml santan",
                        "6 siung bawang merah",
                        "4 siung bawang putih",
                        "5 buah cabai merah",
                        "2 cm lengkuas",
                        "2 batang serai",
                        "3 lembar daun jeruk",
                        "2 lembar daun salam",
                        "Garam secukupnya"
                ),
                Arrays.asList(
                        "Potong daging sapi.",
                        "Haluskan bawang merah, bawang putih, dan cabai.",
                        "Masukkan santan ke wajan.",
                        "Tambahkan bumbu halus dan rempah.",
                        "Masukkan daging sapi.",
                        "Masak menggunakan api kecil.",
                        "Tambahkan garam.",
                        "Masak hingga santan menyusut dan daging empuk."
                )
        ));

        recipeList.add(new Recipe(
                6,
                "Bakso Kuah",
                R.drawable.bakso,
                "Bakso sapi dengan kuah kaldu hangat yang cocok dinikmati kapan saja.",
                "45 menit",
                "Sedang",
                Arrays.asList(
                        "10 buah bakso sapi",
                        "1 liter air",
                        "3 siung bawang putih",
                        "1 batang daun bawang",
                        "1 batang seledri",
                        "100 gram mie",
                        "100 gram sawi",
                        "Garam secukupnya",
                        "Merica secukupnya"
                ),
                Arrays.asList(
                        "Tumis bawang putih hingga harum.",
                        "Didihkan air.",
                        "Masukkan bawang putih.",
                        "Tambahkan garam dan merica.",
                        "Masukkan bakso.",
                        "Rebus mie dan sawi.",
                        "Susun semua bahan di mangkuk.",
                        "Tuangkan kuah lalu sajikan."
                )
        ));

        recipeList.add(new Recipe(
                7,
                "Sate Ayam",
                R.drawable.sate_ayam,
                "Sate ayam dengan bumbu kacang gurih dan kecap manis.",
                "50 menit",
                "Sedang",
                Arrays.asList(
                        "500 gram daging ayam",
                        "10 tusuk sate",
                        "150 gram kacang tanah",
                        "3 siung bawang putih",
                        "3 buah cabai merah",
                        "3 sdm kecap manis",
                        "Garam secukupnya"
                ),
                Arrays.asList(
                        "Potong ayam menjadi ukuran kecil.",
                        "Tusukkan ayam pada tusuk sate.",
                        "Haluskan kacang, bawang putih, dan cabai.",
                        "Tambahkan kecap dan garam.",
                        "Bakar sate hingga matang.",
                        "Siram dengan bumbu kacang lalu sajikan."
                )
        ));

        recipeList.add(new Recipe(
                8,
                "Rawon",
                R.drawable.rawon,
                "Sup daging khas Jawa Timur dengan kuah hitam dari kluwek.",
                "90 menit",
                "Sulit",
                Arrays.asList(
                        "500 gram daging sapi",
                        "1 liter air",
                        "4 buah kluwek",
                        "5 siung bawang merah",
                        "4 siung bawang putih",
                        "2 batang serai",
                        "3 lembar daun jeruk",
                        "Garam secukupnya"
                ),
                Arrays.asList(
                        "Rebus daging hingga empuk.",
                        "Potong daging sesuai selera.",
                        "Haluskan kluwek, bawang merah, dan bawang putih.",
                        "Tumis bumbu hingga harum.",
                        "Masukkan serai dan daun jeruk.",
                        "Masukkan bumbu ke kuah.",
                        "Tambahkan daging dan garam.",
                        "Masak hingga bumbu meresap."
                )
        ));

        recipeList.add(new Recipe(
                9,
                "Gado-Gado",
                R.drawable.gado_gado,
                "Campuran sayuran rebus dengan tahu, tempe, dan saus kacang.",
                "30 menit",
                "Mudah",
                Arrays.asList(
                        "100 gram tauge",
                        "100 gram kol",
                        "100 gram kacang panjang",
                        "1 buah kentang",
                        "2 buah tahu",
                        "2 potong tempe",
                        "150 gram kacang tanah",
                        "2 sdm gula merah",
                        "Garam secukupnya"
                ),
                Arrays.asList(
                        "Rebus semua sayuran.",
                        "Goreng tahu dan tempe.",
                        "Haluskan kacang tanah.",
                        "Tambahkan gula merah dan garam.",
                        "Tambahkan sedikit air.",
                        "Susun sayuran, tahu, dan tempe.",
                        "Siram dengan saus kacang."
                )
        ));

        recipeList.add(new Recipe(
                10,
                "Capcay",
                R.drawable.capcay,
                "Tumisan berbagai jenis sayuran dengan rasa gurih dan segar.",
                "25 menit",
                "Mudah",
                Arrays.asList(
                        "100 gram wortel",
                        "100 gram brokoli",
                        "100 gram kol",
                        "50 gram sawi",
                        "3 siung bawang putih",
                        "1 sdm saus tiram",
                        "Garam secukupnya",
                        "Merica secukupnya"
                ),
                Arrays.asList(
                        "Potong semua sayuran.",
                        "Tumis bawang putih hingga harum.",
                        "Masukkan wortel.",
                        "Tambahkan brokoli, kol, dan sawi.",
                        "Tambahkan saus tiram.",
                        "Bumbui dengan garam dan merica.",
                        "Masak hingga sayuran matang."
                )
        ));

        recipeList.add(new Recipe(
                11,
                "Ayam Bakar",
                R.drawable.ayam_bakar,
                "Ayam berbumbu kecap yang dibakar hingga harum dan kecokelatan.",
                "60 menit",
                "Sedang",
                Arrays.asList(
                        "500 gram ayam",
                        "4 sdm kecap manis",
                        "4 siung bawang merah",
                        "3 siung bawang putih",
                        "2 buah kemiri",
                        "1 cm jahe",
                        "Garam secukupnya"
                ),
                Arrays.asList(
                        "Haluskan semua bumbu.",
                        "Tumis bumbu hingga harum.",
                        "Masukkan ayam.",
                        "Tambahkan kecap dan sedikit air.",
                        "Masak hingga bumbu meresap.",
                        "Bakar ayam hingga kecokelatan.",
                        "Sajikan selagi hangat."
                )
        ));

        recipeList.add(new Recipe(
                12,
                "Ayam Opor",
                R.drawable.opor_ayam,
                "Ayam dengan kuah santan gurih dan rempah khas Indonesia.",
                "60 menit",
                "Sedang",
                Arrays.asList(
                        "500 gram ayam",
                        "500 ml santan",
                        "5 siung bawang merah",
                        "3 siung bawang putih",
                        "3 buah kemiri",
                        "2 cm kunyit",
                        "2 lembar daun salam",
                        "1 batang serai",
                        "Garam secukupnya"
                ),
                Arrays.asList(
                        "Haluskan bawang, kemiri, dan kunyit.",
                        "Tumis bumbu hingga harum.",
                        "Masukkan daun salam dan serai.",
                        "Masukkan ayam.",
                        "Tambahkan santan.",
                        "Tambahkan garam.",
                        "Masak hingga ayam matang dan kuah mengental."
                )
        ));

        recipeList.add(new Recipe(
                13,
                "Nasi Uduk",
                R.drawable.nasi_uduk,
                "Nasi gurih yang dimasak dengan santan dan rempah aromatik.",
                "45 menit",
                "Mudah",
                Arrays.asList(
                        "500 gram beras",
                        "600 ml santan",
                        "2 lembar daun salam",
                        "2 batang serai",
                        "1 lembar daun pandan",
                        "1 sdt garam"
                ),
                Arrays.asList(
                        "Cuci beras hingga bersih.",
                        "Masukkan beras ke dalam panci.",
                        "Tambahkan santan.",
                        "Masukkan daun salam, serai, pandan, dan garam.",
                        "Masak hingga santan meresap.",
                        "Kukus nasi hingga matang.",
                        "Sajikan dengan lauk."
                )
        ));

        recipeList.add(new Recipe(
                14,
                "Pecel Lele",
                R.drawable.pecel_lele,
                "Lele goreng renyah yang disajikan dengan sambal dan lalapan.",
                "35 menit",
                "Mudah",
                Arrays.asList(
                        "2 ekor ikan lele",
                        "1 buah jeruk nipis",
                        "5 buah cabai merah",
                        "5 buah cabai rawit",
                        "2 buah tomat",
                        "3 siung bawang merah",
                        "1 siung bawang putih",
                        "Garam secukupnya"
                ),
                Arrays.asList(
                        "Bersihkan ikan lele.",
                        "Lumuri dengan jeruk nipis dan garam.",
                        "Goreng lele hingga matang.",
                        "Goreng cabai, tomat, dan bawang.",
                        "Haluskan bahan sambal.",
                        "Tambahkan garam.",
                        "Sajikan lele dengan sambal dan lalapan."
                )
        ));

        recipeList.add(new Recipe(
                15,
                "Pempek",
                R.drawable.pempek,
                "Olahan ikan dan tepung sagu khas Palembang yang disajikan dengan kuah cuko.",
                "75 menit",
                "Sulit",
                Arrays.asList(
                        "300 gram ikan tenggiri",
                        "200 gram tepung sagu",
                        "150 ml air",
                        "1 butir telur",
                        "3 siung bawang putih",
                        "200 gram gula merah",
                        "5 buah cabai rawit",
                        "Garam secukupnya"
                ),
                Arrays.asList(
                        "Haluskan daging ikan.",
                        "Campurkan ikan dengan air dan garam.",
                        "Masukkan tepung sagu secara perlahan.",
                        "Bentuk adonan pempek.",
                        "Rebus hingga mengapung.",
                        "Goreng pempek hingga matang.",
                        "Masak gula merah, bawang putih, dan cabai untuk cuko.",
                        "Sajikan pempek bersama cuko."
                )
        ));

        recipeList.add(new Recipe(
                16,
                "Martabak Telur",
                R.drawable.martabak_telur,
                "Martabak gurih berisi telur, daging, dan daun bawang.",
                "50 menit",
                "Sedang",
                Arrays.asList(
                        "10 lembar kulit lumpia",
                        "3 butir telur",
                        "150 gram daging cincang",
                        "3 batang daun bawang",
                        "1 buah bawang bombai",
                        "Garam secukupnya",
                        "Merica secukupnya"
                ),
                Arrays.asList(
                        "Tumis daging dan bawang bombai.",
                        "Campurkan telur dan daun bawang.",
                        "Masukkan tumisan daging.",
                        "Tambahkan garam dan merica.",
                        "Letakkan adonan di atas kulit lumpia.",
                        "Lipat kulit hingga tertutup.",
                        "Goreng hingga kecokelatan."
                )
        ));

        recipeList.add(new Recipe(
                17,
                "Sop Buntut",
                R.drawable.sop_buntut,
                "Sup buntut sapi dengan kuah bening, sayuran, dan rempah.",
                "120 menit",
                "Sulit",
                Arrays.asList(
                        "500 gram buntut sapi",
                        "1,5 liter air",
                        "2 buah wortel",
                        "2 buah kentang",
                        "4 siung bawang putih",
                        "1 batang daun bawang",
                        "1 batang seledri",
                        "Garam secukupnya",
                        "Merica secukupnya"
                ),
                Arrays.asList(
                        "Rebus buntut sapi hingga empuk.",
                        "Buang kotoran yang muncul di permukaan.",
                        "Tumis bawang putih.",
                        "Masukkan bawang ke kuah.",
                        "Tambahkan wortel dan kentang.",
                        "Tambahkan garam dan merica.",
                        "Masak hingga sayuran matang.",
                        "Tambahkan daun bawang dan seledri."
                )
        ));

        recipeList.add(new Recipe(
                18,
                "Nasi Kuning",
                R.drawable.nasi_kuning,
                "Nasi gurih berwarna kuning dari kunyit yang cocok untuk berbagai acara.",
                "50 menit",
                "Mudah",
                Arrays.asList(
                        "500 gram beras",
                        "600 ml santan",
                        "2 cm kunyit",
                        "2 lembar daun salam",
                        "2 batang serai",
                        "1 lembar daun pandan",
                        "Garam secukupnya"
                ),
                Arrays.asList(
                        "Cuci beras hingga bersih.",
                        "Haluskan kunyit.",
                        "Campurkan kunyit dengan santan.",
                        "Masukkan beras, santan, dan rempah.",
                        "Masak hingga air menyusut.",
                        "Kukus nasi hingga matang.",
                        "Sajikan dengan lauk."
                )
        ));

        recipeList.add(new Recipe(
                19,
                "Ikan Bakar",
                R.drawable.ikan_bakar,
                "Ikan berbumbu kecap dan rempah yang dibakar hingga harum.",
                "45 menit",
                "Sedang",
                Arrays.asList(
                        "1 ekor ikan nila",
                        "3 sdm kecap manis",
                        "3 siung bawang putih",
                        "4 siung bawang merah",
                        "1 cm jahe",
                        "1 buah jeruk nipis",
                        "Garam secukupnya"
                ),
                Arrays.asList(
                        "Bersihkan ikan.",
                        "Lumuri ikan dengan jeruk nipis dan garam.",
                        "Haluskan bawang dan jahe.",
                        "Campurkan bumbu dengan kecap.",
                        "Oleskan bumbu pada ikan.",
                        "Bakar ikan sambil diolesi bumbu.",
                        "Masak hingga matang lalu sajikan."
                )
        ));

        recipeList.add(new Recipe(
                20,
                "Telur Balado",
                R.drawable.telur_balado,
                "Telur rebus yang dimasak dengan sambal balado pedas dan gurih.",
                "30 menit",
                "Mudah",
                Arrays.asList(
                        "5 butir telur",
                        "8 buah cabai merah",
                        "5 siung bawang merah",
                        "2 siung bawang putih",
                        "1 buah tomat",
                        "1 sdt gula",
                        "Garam secukupnya",
                        "Minyak goreng secukupnya"
                ),
                Arrays.asList(
                        "Rebus telur hingga matang.",
                        "Kupas kulit telur.",
                        "Goreng telur sebentar hingga permukaannya kecokelatan.",
                        "Haluskan cabai, bawang, dan tomat.",
                        "Tumis bumbu hingga matang.",
                        "Tambahkan gula dan garam.",
                        "Masukkan telur.",
                        "Aduk hingga bumbu merata kemudian sajikan."
                )
        ));

        return recipeList;
    }
}