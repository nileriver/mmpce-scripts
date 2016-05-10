package tweakers

config {
    mod   "quadrum"
    group "tweakers"
    name  "Quadrum"
    file {
        id   = "quadrum_main"
        path = "Quadrum/Quadrum.cfg"
    }
    files {
        regex = /Quadrum\/block\/(.*)\.json/
        id    = "quadrum_block_%1"
        type  = JSON
    }
    files {
        regex = /Quadrum\/block\/lang\/(.*)\.lang/
        id    = "quadrum_block_lang_%1"
        type  = PROPERTY
    }
    files {
        regex = /Quadrum\/block\/textures\/(.*)\.png/
        id    = "quadrum_block_textures_%1"
        type  = IMAGE
    }
    files {
        regex = /Quadrum\/item\/(.*)\.json/
        id    = "quadrum_item_%1"
        type  = JSON
    }
    files {
        regex = /Quadrum\/item\/lang\/(.*)\.lang/
        id    = "quadrum_item_lang_%1"
        type  = PROPERTY
    }
    files {
        regex = /Quadrum\/item\/textures\/(.*)\.png/
        id    = "quadrum_item_textures_%1"
        type  = IMAGE
    }
}