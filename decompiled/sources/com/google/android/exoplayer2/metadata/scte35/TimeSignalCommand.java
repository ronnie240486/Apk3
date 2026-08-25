package com.google.android.exoplayer2.metadata.scte35;

/* JADX INFO: loaded from: classes.dex */
public final class TimeSignalCommand extends com.google.android.exoplayer2.metadata.scte35.SpliceCommand {
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand> CREATOR = null;
    public final long playbackPositionUs;
    public final long ptsTime;


    static {
            com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand$1 r0 = new com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand$1
            r0.<init>()
            com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand.CREATOR = r0
            return
    }

    private TimeSignalCommand(long r1, long r3) {
            r0 = this;
            r0.<init>()
            r0.ptsTime = r1
            r0.playbackPositionUs = r3
            return
    }

    public /* synthetic */ TimeSignalCommand(long r1, long r3, com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand.AnonymousClass1 r5) {
            r0 = this;
            r0.<init>(r1, r3)
            return
    }

    public static com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand parseFromSection(com.google.android.exoplayer2.util.ParsableByteArray r1, long r2, com.google.android.exoplayer2.util.TimestampAdjuster r4) {
            long r1 = parseSpliceTime(r1, r2)
            long r3 = r4.adjustTsTimestamp(r1)
            com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand r0 = new com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand
            r0.<init>(r1, r3)
            return r0
    }

    public static long parseSpliceTime(com.google.android.exoplayer2.util.ParsableByteArray r7, long r8) {
            int r0 = r7.readUnsignedByte()
            long r0 = (long) r0
            r2 = 128(0x80, double:6.3E-322)
            long r2 = r2 & r0
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L21
            r2 = 1
            long r0 = r0 & r2
            r2 = 32
            long r0 = r0 << r2
            long r2 = r7.readUnsignedInt()
            long r0 = r0 | r2
            long r0 = r0 + r8
            r7 = 8589934591(0x1ffffffff, double:4.2439915814E-314)
            long r7 = r7 & r0
            goto L26
        L21:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L26:
            return r7
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            long r0 = r2.ptsTime
            r3.writeLong(r0)
            long r0 = r2.playbackPositionUs
            r3.writeLong(r0)
            return
    }
}
