package com.google.android.exoplayer2.metadata.scte35;

/* JADX INFO: loaded from: classes.dex */
public final class PrivateCommand extends com.google.android.exoplayer2.metadata.scte35.SpliceCommand {
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.scte35.PrivateCommand> CREATOR = null;
    public final byte[] commandBytes;
    public final long identifier;
    public final long ptsAdjustment;


    static {
            com.google.android.exoplayer2.metadata.scte35.PrivateCommand$1 r0 = new com.google.android.exoplayer2.metadata.scte35.PrivateCommand$1
            r0.<init>()
            com.google.android.exoplayer2.metadata.scte35.PrivateCommand.CREATOR = r0
            return
    }

    private PrivateCommand(long r1, byte[] r3, long r4) {
            r0 = this;
            r0.<init>()
            r0.ptsAdjustment = r4
            r0.identifier = r1
            r0.commandBytes = r3
            return
    }

    private PrivateCommand(android.os.Parcel r3) {
            r2 = this;
            r2.<init>()
            long r0 = r3.readLong()
            r2.ptsAdjustment = r0
            long r0 = r3.readLong()
            r2.identifier = r0
            byte[] r3 = r3.createByteArray()
            java.lang.Object r3 = com.google.android.exoplayer2.util.Util.castNonNull(r3)
            byte[] r3 = (byte[]) r3
            r2.commandBytes = r3
            return
    }

    public /* synthetic */ PrivateCommand(android.os.Parcel r1, com.google.android.exoplayer2.metadata.scte35.PrivateCommand.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static com.google.android.exoplayer2.metadata.scte35.PrivateCommand parseFromSection(com.google.android.exoplayer2.util.ParsableByteArray r6, int r7, long r8) {
            long r1 = r6.readUnsignedInt()
            int r7 = r7 + (-4)
            byte[] r3 = new byte[r7]
            r0 = 0
            r6.readBytes(r3, r0, r7)
            com.google.android.exoplayer2.metadata.scte35.PrivateCommand r6 = new com.google.android.exoplayer2.metadata.scte35.PrivateCommand
            r0 = r6
            r4 = r8
            r0.<init>(r1, r3, r4)
            return r6
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            long r0 = r2.ptsAdjustment
            r3.writeLong(r0)
            long r0 = r2.identifier
            r3.writeLong(r0)
            byte[] r4 = r2.commandBytes
            r3.writeByteArray(r4)
            return
    }
}
