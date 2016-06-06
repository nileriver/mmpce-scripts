package addons.tinkers

config {
    mod   "iguana_tinker_tweaks"
    group "addons_tinkers"
    name  "Iguana Tinker Tweaks"
//    file {
//        id   = "iguana_tinker_tweaks_main"
//        path = "IguanaTinkerTweaks/main.cfg"
//    }
    file {
        id   = "iguana_tinker_tweaks_main"
        path = "IguanaTinkerTweaks/main.cfg"
        type  = FORGE_PROPS
    }
    file {
        id   = "iguana_tinker_tweaks_block_defaults"
        path = "IguanaTinkerTweaks/BlockDefaults.cfg"
        type  = FORGE_PROPS
    }
    file {
        id   = "iguana_tinker_tweaks_block_override"
        path = "IguanaTinkerTweaks/BlockOverride.cfg"
        type  = RAW
    }
    file {
        id   = "iguana_tinker_tweaks_bonus_modifier_defaults"
        path = "IguanaTinkerTweaks/BonusModifierDefaults.cfg"
        type  = FORGE_PROPS
    }
    file {
        id   = "iguana_tinker_tweaks_bonus_modifier_override"
        path = "IguanaTinkerTweaks/BonusModifierOverride.cfg"
        type  = FORGE_PROPS
    }
    file {
        id   = "iguana_tinker_tweaks_harvest_level_names_default"
        path = "IguanaTinkerTweaks/HarvestLevelNamesDefaults.cfg"
        type  = FORGE_PROPS
    }
    file {
        id   = "iguana_tinker_tweaks_harvest_level_names_override"
        path = "IguanaTinkerTweaks/HarvestLevelNamesOverride.cfg"
        type  = RAW
    }
    file {
        id   = "iguana_tinker_tweaks_material_defaults"
        path = "IguanaTinkerTweaks/MaterialDefaults.cfg"
        type  = FORGE_PROPS
    }
    file {
        id   = "iguana_tinker_tweaks_material_override"
        path = "IguanaTinkerTweaks/MaterialOverride.cfg"
        type  = FORGE_PROPS
    }
    file {
        id   = "iguana_tinker_tweaks_modules"
        path = "IguanaTinkerTweaks/Modules.cfg"
        type  = FORGE_PROPS
    }
    file {
        id   = "iguana_tinker_tweaks_restrictions"
        path = "IguanaTinkerTweaks/restrictions.cfg"
        type  = FORGE_PROPS
    }
    file {
        id   = "iguana_tinker_tweaks_tool_defaults"
        path = "IguanaTinkerTweaks/ToolDefaults.cfg"
        type  = FORGE_PROPS
    }
    file {
        id   = "iguana_tinker_tweaks_tool_override"
        path = "IguanaTinkerTweaks/ToolOverride.cfg"
        type  = FORGE_PROPS
    }
}