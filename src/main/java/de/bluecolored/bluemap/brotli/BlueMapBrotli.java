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
                Key.parse("bluemap-brotli:brotli"),
                "br",
                ".br",
                out -> new BrotliOutputStream(out, new Encoder.Parameters().setQuality(5)),
                BrotliInputStream::new
        ));

    }

}
