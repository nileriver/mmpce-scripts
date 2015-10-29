package agriculture

config {
    mod   "agricraft"
    group "agriculture"
    name  "Agricraft"
    file {
        id   = "agricraft_main"
        path = "agricraft/Configuration.cfg"
    }
    file {
        id   = "agricraft_custom_crops"
        path = "agricraft/CustomCrops.txt"
    }
    file {
        id   = "agricraft_grass_drops"
        path = "agricraft/GrassDrops.txt"
    }
    file {
        id   = "agricraft_mutations_overrides"
        path = "agricraft/MutationChancesOverrides.txt"
    }
    file {
        id   = "agricraft_mutations"
        path = "agricraft/Mutations.txt"
    }
    file {
        id   = "agricraft_seed_blacklist"
        path = "agricraft/SeedBlackList.txt"
    }
    file {
        id   = "agricraft_seed_tiers"
        path = "agricraft/SeedTiers.txt"
    }
    file {
        id   = "agricraft_soil"
        path = "agricraft/SoilWhitelist.txt"
    }
    file {
        id   = "agricraft_spread"
        path = "agricraft/SpreadChancesOverrides.txt"
    }
}