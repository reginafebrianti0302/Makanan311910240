package com.example.makanan311910240;

import java.util.ArrayList;
public class DataKuliner {
    public static String[][] data = new String[][]{
            {"Ketoprak", "Ketoprak adalah salah satu jenis makanan khas Indonesia menggunakan ketupat yang mudah dijumpai. Biasanya ketoprak dijajakan menggunakan kereta dorong di jalan-jalan atau kaki lima.\n" +
            "\n" +
            "Bahan-bahan utamanya adalah tahu, bihun, mentimun, taoge, dan bisa juga memakai telur rebus yang dilengkapi dengan saus kacang, kecap manis, dan taburan bawang merah goreng. Dapat pula dihidangkan dengan tambahan kerupuk atau emping melinjo. Beberapa versi ada pula yang menyertakan tempe sebagai komponennya. Alat yang digunakan untuk mengolah ketoprak tidaklah sulit, yakni hanya butuh ulekan dan pisau.",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2e/Ketoprak_Boplo.JPG/800px-Ketoprak_Boplo.JPG"},

            {"Gado-gado", "Gado-gado adalah makanan khas Jakarta berisi sayur-sayuran yang direbus, irisan telur dan tahu, serta ditaburi bawang goreng dan kerupuk. Sayur-sayuran ditambahkan dengan bumbu kacang atau saus dari kacang tanah yang telah dihaluskan yang kemudian diaduk merata.\n" +
            "\n" +
            "Gado-gado dapat dimakan langsung seperti selada dengan bumbu/saus kacang, atau dapat juga dimakan beserta nasi putih atau kadangkadang juga disajikan dengan lontong.\n" +
            "\n" +
            "Adanya makanan gado-gado pada abad 17 (1628-1629) bermula saat kesultanan Mataram yang dipimpin Sultan Agung melakukan Penyerbuan di Batavia kehabisan pasokan bahan makanan terutama beras, selain itu lumbung-lumbung beras di sekitar Batavia dibakar oleh VOC, sehingga membuat perajurit warok dari Ponorogo yang tergabung dalam pasukan perang membuat sambal bumbu pecel dari kacang, kemudian disiramkan ke berbagai sayuran mentah yang ada di sekitar persawahan untuk bertahan hidup. Tindakan ini dalam bahasa jawa disebut Gado yang berarti makan hanya lauk saja atau makan lauk tanpa nasi, apa yang dilakukan oleh warok ini diikuti oleh prajurit lainnya untuk memakan sayur seadanya yang disiram sairan bumbu pecel. Seiring perkembangan zaman, kini gado-gado ditambahkan lontong yang diiris kecil, telur, tahu dan kerupuk yang disajikan di warung kecil hingga restoran.",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a2/Gado_gado.jpg/800px-Gado_gado.jpg"},

            {"Kerak Telor", "Kerak telur adalah makanan asli daerah Jakarta (Betawi), dengan bahan-bahan beras ketan putih, telur ayam atau bebek, ebi (udang kering yang diasinkan) yang disangrai kering ditambah bawang merah goreng, lalu diberi bumbu yang dihaluskan berupa kelapa sangrai, cabai merah, kencur, jahe, merica butiran, garam dan gula pasir. Kerak telor dapat ditemukan pada hari biasa. Anda bisa menemukan kerak telor di sekitar Kota Tua, Jakarta Barat. Menurut sejarah, Kerak Telor sudah ada dari zaman kolonial Belanda, kerak telor diciptakan oleh masyarakat Betawi secara tak sengaja Pada tahun 1970-an.",
            "https://sweetrip.id/wp-content/uploads/2021/10/julie_in_bali_230134577_387160129475942_7979102418308754760_n.jpg"},

            {"Tahu Gimbal", "Tahu gimbal adalah makanan khas Kota Semarang.Makanan ini terdiri dari tahu goreng, rajangan kol mentah, lontong, taoge, telur, dan gimbal (udang yang digoreng dengan tepung) dan dicampur dengan bumbu kacang yang khas karena menggunakan petis udang. Beda dengan saus kacang untuk pecel Madiun yang agak kental. Saus bumbu kacang untuk tahu gimbal agak sedikit encer.",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/2/26/Tahu_gimbal_in_Semarang.jpg/800px-Tahu_gimbal_in_Semarang.jpg"},

            {"Tahu Petis", "Tahu petis adalah jajanan khas kota Semarang berupa tahu goreng yang dimakan dengan petis (saus berwarna hitam kental yang biasanya terbuat dari udang) yang dioleskan/disisipkan di tengahtengah tahu. Seperti tahu pong tetapi rasanya tidak asin, yaitu berasal dari tahu putih yang digoreng sampai warna kecokelatan tanpa dibumbui atau dibumbui dengan larutan garam dan bawang putih saja.Sedangkan petisnya berasa manis agak sedikit asin. Agar menggugah selera tahu petis biasanya dimakan dengan cabai rawit.",
            "https://i0.wp.com/resepkoki.id/wp-content/uploads/2018/01/Resep-Tahu-Petis.jpg?fit=1129%2C942&ssl=1"},

            {"Es Cendol", "adalah penganan yang dibuat dari tepung beras dan sebagainya yang dibentuk dengan penyaring, kemudian dicampur dengan air gula dan santan. Cendol merupakan minuman penutup es manis yang mengandung tetesan tepung beras hijau, santan, dan sirup gula aren. Cendol populer di Indonesia dan Asia Tenggara lainnya seperti Brunei, Cambodia, Malaysia, Singapura, Thailand, Vietnam, dan Myanmar.",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/8/89/%22%2Barya%2B%22_es_cendol_dawet_2021.jpg/320px-%22%2Barya%2B%22_es_cendol_dawet_2021.jpg"},

            {"Kue Putu", "adalah jenis kudapan tradisional Indonesia berupa kue dengan isian gula jawa, dibalut dengan parutan kelapa, dan tepung beras butiran kasar. Kue ini di kukus dengan diletakkan di dalam tabung bambu yang sedikit dipadatkan. Kue ini dijual pada saat matahari terbenam sampai larut malam. Suara khas uap yang keluar dari alat suitan ini sekaligus menjadi alat promosi bagi pedagang yang berjualan.",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/d/da/22._Ku%C3%A9_putu_1.jpg/800px-22._Ku%C3%A9_putu_1.jpg"},
        };
public static ArrayList<ModelKuliner> ambilDataKuliner() {
        ArrayList<ModelKuliner> dataKuliner = new ArrayList<>();
        for (String[] varData : data) {
        ModelKuliner model = new ModelKuliner();
        model.setNama(varData[0]);
        model.setTentang(varData[1]);
        model.setFoto(varData[2]);
        dataKuliner.add(model);
        }
        return dataKuliner;
        }
    }