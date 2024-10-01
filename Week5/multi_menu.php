<?php
 $menu = [
    [
        "nama" => "Beranda"
    ],
    [
        "nama" => "Berita",
        "SubMenu" => [
            [
            "nama" => "Wisata",
            "submenu" => [
            [
                "nama" => "Pantai"
            ],
            [
                "nama" => "Gunung"
            ]
        ]
    ],
            [
                "nama" => "kuliner"
            ],
            [
                "nama" => "hiburan"
            ]
        ]
    ],
    [
        "nama" => "Tentang"
    ],
    [
        "nama" => "Kontak"
    ],
];

function tampilkanMenuBertingkat(array $menu) {
    echo "<ul>";
    foreach ($menu as $item) {
        echo "<li>{$item['nama']}";
        if (isset($item['SubMenu']) && is_array($item['SubMenu'])) {
            tampilkanMenuBertingkat($item['SubMenu']);
        }
        if (isset($item['submenu']) && is_array($item['submenu'])) {
            tampilkanMenuBertingkat($item['submenu']);
        }
        echo "</li>";
    }
    echo "</ul>";
}

tampilkanMenuBertingkat($menu);




?>