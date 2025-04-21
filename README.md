# BlueMap Brotli
A native addon for bluemap, adding brotli-compression support.

## Usage
- download the [bluemap-brotli.jar](https://github.com/BlueMap-Minecraft/BlueMapBrotli/releases) that fits to your BlueMap version
- place the jar file into the `packs` folder next to your bluemap config files
- change the `compression` in your storage-config (`storages/file.conf` or `storages/sql.conf`) to `"bluemap-brotli:brotli"` or `"bluemap-brotli:brotli-<level>"` where the level is from 1 to 11
- reload bluemap
