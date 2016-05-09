package tweakers


config {
    mod   "climate_control"
    group "tweakers"
    name  "Climate control"
    //todo: add
//    disabled false
    file {
        id   = "climate_control_main"
        path = "climatecontrol.cfg"
    }
    files {
        regex = /ClimateControl\/(.*)\.cfg/
        id    = "climate_control_extension_%1"
    }
}