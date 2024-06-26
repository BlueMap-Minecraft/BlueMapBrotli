package de.bluecolored.bluemap.brotli;

import com.aayushatharva.brotli4j.Brotli4jLoader;
import com.aayushatharva.brotli4j.decoder.BrotliInputStream;
import com.aayushatharva.brotli4j.encoder.BrotliOutputStream;
import com.aayushatharva.brotli4j.encoder.Encoder;
import de.bluecolored.bluemap.core.storage.compression.BufferedCompression;
import de.bluecolored.bluemap.core.storage.compression.Compression;
import de.bluecolored.bluemap.core.util.Key;

@SuppressWarnings("unused")
public class BlueMapBrotli implements Runnable {

    @Override
    public void run() {
        Brotli4jLoader.ensureAvailability();
        Compression.REGISTRY.register(new BufferedCompression(
                new Key("bluemap-brotli", "brotli"),
                "br",
                ".br",
                out -> new BrotliOutputStream(out, new Encoder.Parameters().setQuality(5)),
                BrotliInputStream::new
        ));

        Compression.REGISTRY.register(new BufferedCompression(
                new Key("bluemap-brotli", "brotli-1"),
                "br",
                ".br",
                out -> new BrotliOutputStream(out, new Encoder.Parameters().setQuality(1)),
                BrotliInputStream::new
        ));

        Compression.REGISTRY.register(new BufferedCompression(
                new Key("bluemap-brotli", "brotli-2"),
                "br",
                ".br",
                out -> new BrotliOutputStream(out, new Encoder.Parameters().setQuality(2)),
                BrotliInputStream::new
        ));

        Compression.REGISTRY.register(new BufferedCompression(
                new Key("bluemap-brotli", "brotli-3"),
                "br",
                ".br",
                out -> new BrotliOutputStream(out, new Encoder.Parameters().setQuality(3)),
                BrotliInputStream::new
        ));

        Compression.REGISTRY.register(new BufferedCompression(
                new Key("bluemap-brotli", "brotli-4"),
                "br",
                ".br",
                out -> new BrotliOutputStream(out, new Encoder.Parameters().setQuality(4)),
                BrotliInputStream::new
        ));

        Compression.REGISTRY.register(new BufferedCompression(
                new Key("bluemap-brotli", "brotli-5"),
                "br",
                ".br",
                out -> new BrotliOutputStream(out, new Encoder.Parameters().setQuality(5)),
                BrotliInputStream::new
        ));

        Compression.REGISTRY.register(new BufferedCompression(
                new Key("bluemap-brotli", "brotli-6"),
                "br",
                ".br",
                out -> new BrotliOutputStream(out, new Encoder.Parameters().setQuality(6)),
                BrotliInputStream::new
        ));

        Compression.REGISTRY.register(new BufferedCompression(
                new Key("bluemap-brotli", "brotli-7"),
                "br",
                ".br",
                out -> new BrotliOutputStream(out, new Encoder.Parameters().setQuality(7)),
                BrotliInputStream::new
        ));

        Compression.REGISTRY.register(new BufferedCompression(
                new Key("bluemap-brotli", "brotli-8"),
                "br",
                ".br",
                out -> new BrotliOutputStream(out, new Encoder.Parameters().setQuality(8)),
                BrotliInputStream::new
        ));

        Compression.REGISTRY.register(new BufferedCompression(
                new Key("bluemap-brotli", "brotli-9"),
                "br",
                ".br",
                out -> new BrotliOutputStream(out, new Encoder.Parameters().setQuality(9)),
                BrotliInputStream::new
        ));

        Compression.REGISTRY.register(new BufferedCompression(
                new Key("bluemap-brotli", "brotli-10"),
                "br",
                ".br",
                out -> new BrotliOutputStream(out, new Encoder.Parameters().setQuality(10)),
                BrotliInputStream::new
        ));

        Compression.REGISTRY.register(new BufferedCompression(
                new Key("bluemap-brotli", "brotli-11"),
                "br",
                ".br",
                out -> new BrotliOutputStream(out, new Encoder.Parameters().setQuality(11)),
                BrotliInputStream::new
        ));
    }

}
