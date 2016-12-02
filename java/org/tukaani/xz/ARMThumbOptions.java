package org.tukaani.xz;

import java.io.InputStream;
import org.tukaani.xz.simple.ARMThumb;

public class ARMThumbOptions extends BCJOptions {
    private static final int ALIGNMENT = 2;

    public /* bridge */ /* synthetic */ Object clone() {
        return super.clone();
    }

    public /* bridge */ /* synthetic */ int getDecoderMemoryUsage() {
        return super.getDecoderMemoryUsage();
    }

    public /* bridge */ /* synthetic */ int getEncoderMemoryUsage() {
        return super.getEncoderMemoryUsage();
    }

    public /* bridge */ /* synthetic */ int getStartOffset() {
        return super.getStartOffset();
    }

    public /* bridge */ /* synthetic */ void setStartOffset(int i) throws UnsupportedOptionsException {
        super.setStartOffset(i);
    }

    public ARMThumbOptions() {
        super(ALIGNMENT);
    }

    public FinishableOutputStream getOutputStream(FinishableOutputStream out) {
        return new SimpleOutputStream(out, new ARMThumb(true, this.startOffset));
    }

    public InputStream getInputStream(InputStream in) {
        return new SimpleInputStream(in, new ARMThumb(false, this.startOffset));
    }

    FilterEncoder getFilterEncoder() {
        return new BCJEncoder(this, 8);
    }
}
