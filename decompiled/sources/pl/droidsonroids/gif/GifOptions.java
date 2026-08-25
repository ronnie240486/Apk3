package pl.droidsonroids.gif;

/* JADX INFO: loaded from: classes3.dex */
public class GifOptions {
    public boolean inIsOpaque;
    public char inSampleSize;

    public GifOptions() {
            r0 = this;
            r0.<init>()
            r0.reset()
            return
    }

    private void reset() {
            r1 = this;
            r0 = 1
            r1.inSampleSize = r0
            r0 = 0
            r1.inIsOpaque = r0
            return
    }

    public final void setFrom(@androidx.annotation.Nullable pl.droidsonroids.gif.GifOptions r2) {
            r1 = this;
            if (r2 != 0) goto L6
            r1.reset()
            goto Le
        L6:
            boolean r0 = r2.inIsOpaque
            r1.inIsOpaque = r0
            char r2 = r2.inSampleSize
            r1.inSampleSize = r2
        Le:
            return
    }

    public void setInIsOpaque(boolean r1) {
            r0 = this;
            r0.inIsOpaque = r1
            return
    }

    public void setInSampleSize(@androidx.annotation.IntRange(from = 1, to = 65535) int r3) {
            r2 = this;
            r0 = 1
            if (r3 < r0) goto Ld
            r1 = 65535(0xffff, float:9.1834E-41)
            if (r3 <= r1) goto L9
            goto Ld
        L9:
            char r3 = (char) r3
            r2.inSampleSize = r3
            goto Lf
        Ld:
            r2.inSampleSize = r0
        Lf:
            return
    }
}
