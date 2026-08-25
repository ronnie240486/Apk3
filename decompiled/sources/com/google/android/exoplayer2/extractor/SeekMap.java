package com.google.android.exoplayer2.extractor;

/* JADX INFO: loaded from: classes2.dex */
public interface SeekMap {

    public static final class SeekPoints {
        public final com.google.android.exoplayer2.extractor.SeekPoint first;
        public final com.google.android.exoplayer2.extractor.SeekPoint second;

        public SeekPoints(com.google.android.exoplayer2.extractor.SeekPoint r1) {
                r0 = this;
                r0.<init>(r1, r1)
                return
        }

        public SeekPoints(com.google.android.exoplayer2.extractor.SeekPoint r1, com.google.android.exoplayer2.extractor.SeekPoint r2) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
                com.google.android.exoplayer2.extractor.SeekPoint r1 = (com.google.android.exoplayer2.extractor.SeekPoint) r1
                r0.first = r1
                java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
                com.google.android.exoplayer2.extractor.SeekPoint r1 = (com.google.android.exoplayer2.extractor.SeekPoint) r1
                r0.second = r1
                return
        }

        public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 == 0) goto L29
                java.lang.Class<com.google.android.exoplayer2.extractor.SeekMap$SeekPoints> r2 = com.google.android.exoplayer2.extractor.SeekMap.SeekPoints.class
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L10
                goto L29
            L10:
                com.google.android.exoplayer2.extractor.SeekMap$SeekPoints r5 = (com.google.android.exoplayer2.extractor.SeekMap.SeekPoints) r5
                com.google.android.exoplayer2.extractor.SeekPoint r2 = r4.first
                com.google.android.exoplayer2.extractor.SeekPoint r3 = r5.first
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L27
                com.google.android.exoplayer2.extractor.SeekPoint r2 = r4.second
                com.google.android.exoplayer2.extractor.SeekPoint r5 = r5.second
                boolean r5 = r2.equals(r5)
                if (r5 == 0) goto L27
                goto L28
            L27:
                r0 = 0
            L28:
                return r0
            L29:
                return r1
        }

        public int hashCode() {
                r2 = this;
                com.google.android.exoplayer2.extractor.SeekPoint r0 = r2.first
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                com.google.android.exoplayer2.extractor.SeekPoint r1 = r2.second
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                return r1
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.String r0 = "["
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                com.google.android.exoplayer2.extractor.SeekPoint r1 = r3.first
                r0.append(r1)
                com.google.android.exoplayer2.extractor.SeekPoint r1 = r3.first
                com.google.android.exoplayer2.extractor.SeekPoint r2 = r3.second
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L18
                java.lang.String r1 = ""
                goto L27
            L18:
                java.lang.String r1 = ", "
                java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
                com.google.android.exoplayer2.extractor.SeekPoint r2 = r3.second
                r1.append(r2)
                java.lang.String r1 = r1.toString()
            L27:
                java.lang.String r2 = "]"
                java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class Unseekable implements com.google.android.exoplayer2.extractor.SeekMap {
        private final long durationUs;
        private final com.google.android.exoplayer2.extractor.SeekMap.SeekPoints startSeekPoints;

        public Unseekable(long r3) {
                r2 = this;
                r0 = 0
                r2.<init>(r3, r0)
                return
        }

        public Unseekable(long r3, long r5) {
                r2 = this;
                r2.<init>()
                r2.durationUs = r3
                com.google.android.exoplayer2.extractor.SeekMap$SeekPoints r3 = new com.google.android.exoplayer2.extractor.SeekMap$SeekPoints
                r0 = 0
                int r4 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r4 != 0) goto L10
                com.google.android.exoplayer2.extractor.SeekPoint r4 = com.google.android.exoplayer2.extractor.SeekPoint.START
                goto L15
            L10:
                com.google.android.exoplayer2.extractor.SeekPoint r4 = new com.google.android.exoplayer2.extractor.SeekPoint
                r4.<init>(r0, r5)
            L15:
                r3.<init>(r4)
                r2.startSeekPoints = r3
                return
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public long getDurationUs() {
                r2 = this;
                long r0 = r2.durationUs
                return r0
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public com.google.android.exoplayer2.extractor.SeekMap.SeekPoints getSeekPoints(long r1) {
                r0 = this;
                com.google.android.exoplayer2.extractor.SeekMap$SeekPoints r1 = r0.startSeekPoints
                return r1
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public boolean isSeekable() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    long getDurationUs();

    com.google.android.exoplayer2.extractor.SeekMap.SeekPoints getSeekPoints(long r1);

    boolean isSeekable();
}
