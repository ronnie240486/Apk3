package com.google.android.exoplayer2.metadata.scte35;

/* JADX INFO: loaded from: classes.dex */
public final class SpliceInsertCommand extends com.google.android.exoplayer2.metadata.scte35.SpliceCommand {
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand> CREATOR = null;
    public final boolean autoReturn;
    public final int availNum;
    public final int availsExpected;
    public final long breakDurationUs;
    public final java.util.List<com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand.ComponentSplice> componentSpliceList;
    public final boolean outOfNetworkIndicator;
    public final boolean programSpliceFlag;
    public final long programSplicePlaybackPositionUs;
    public final long programSplicePts;
    public final boolean spliceEventCancelIndicator;
    public final long spliceEventId;
    public final boolean spliceImmediateFlag;
    public final int uniqueProgramId;


    public static final class ComponentSplice {
        public final long componentSplicePlaybackPositionUs;
        public final long componentSplicePts;
        public final int componentTag;

        private ComponentSplice(int r1, long r2, long r4) {
                r0 = this;
                r0.<init>()
                r0.componentTag = r1
                r0.componentSplicePts = r2
                r0.componentSplicePlaybackPositionUs = r4
                return
        }

        public /* synthetic */ ComponentSplice(int r1, long r2, long r4, com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand.AnonymousClass1 r6) {
                r0 = this;
                r0.<init>(r1, r2, r4)
                return
        }

        public static com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand.ComponentSplice createFromParcel(android.os.Parcel r7) {
                com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand$ComponentSplice r6 = new com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand$ComponentSplice
                int r1 = r7.readInt()
                long r2 = r7.readLong()
                long r4 = r7.readLong()
                r0 = r6
                r0.<init>(r1, r2, r4)
                return r6
        }

        public void writeToParcel(android.os.Parcel r3) {
                r2 = this;
                int r0 = r2.componentTag
                r3.writeInt(r0)
                long r0 = r2.componentSplicePts
                r3.writeLong(r0)
                long r0 = r2.componentSplicePlaybackPositionUs
                r3.writeLong(r0)
                return
        }
    }

    static {
            com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand$1 r0 = new com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand$1
            r0.<init>()
            com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand.CREATOR = r0
            return
    }

    private SpliceInsertCommand(long r4, boolean r6, boolean r7, boolean r8, boolean r9, long r10, long r12, java.util.List<com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand.ComponentSplice> r14, boolean r15, long r16, int r18, int r19, int r20) {
            r3 = this;
            r0 = r3
            r3.<init>()
            r1 = r4
            r0.spliceEventId = r1
            r1 = r6
            r0.spliceEventCancelIndicator = r1
            r1 = r7
            r0.outOfNetworkIndicator = r1
            r1 = r8
            r0.programSpliceFlag = r1
            r1 = r9
            r0.spliceImmediateFlag = r1
            r1 = r10
            r0.programSplicePts = r1
            r1 = r12
            r0.programSplicePlaybackPositionUs = r1
            java.util.List r1 = java.util.Collections.unmodifiableList(r14)
            r0.componentSpliceList = r1
            r1 = r15
            r0.autoReturn = r1
            r1 = r16
            r0.breakDurationUs = r1
            r1 = r18
            r0.uniqueProgramId = r1
            r1 = r19
            r0.availNum = r1
            r1 = r20
            r0.availsExpected = r1
            return
    }

    private SpliceInsertCommand(android.os.Parcel r7) {
            r6 = this;
            r6.<init>()
            long r0 = r7.readLong()
            r6.spliceEventId = r0
            byte r0 = r7.readByte()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            r6.spliceEventCancelIndicator = r0
            byte r0 = r7.readByte()
            if (r0 != r2) goto L1e
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            r6.outOfNetworkIndicator = r0
            byte r0 = r7.readByte()
            if (r0 != r2) goto L29
            r0 = 1
            goto L2a
        L29:
            r0 = 0
        L2a:
            r6.programSpliceFlag = r0
            byte r0 = r7.readByte()
            if (r0 != r2) goto L34
            r0 = 1
            goto L35
        L34:
            r0 = 0
        L35:
            r6.spliceImmediateFlag = r0
            long r3 = r7.readLong()
            r6.programSplicePts = r3
            long r3 = r7.readLong()
            r6.programSplicePlaybackPositionUs = r3
            int r0 = r7.readInt()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            r4 = 0
        L4d:
            if (r4 >= r0) goto L59
            com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand$ComponentSplice r5 = com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand.ComponentSplice.createFromParcel(r7)
            r3.add(r5)
            int r4 = r4 + 1
            goto L4d
        L59:
            java.util.List r0 = java.util.Collections.unmodifiableList(r3)
            r6.componentSpliceList = r0
            byte r0 = r7.readByte()
            if (r0 != r2) goto L66
            r1 = 1
        L66:
            r6.autoReturn = r1
            long r0 = r7.readLong()
            r6.breakDurationUs = r0
            int r0 = r7.readInt()
            r6.uniqueProgramId = r0
            int r0 = r7.readInt()
            r6.availNum = r0
            int r7 = r7.readInt()
            r6.availsExpected = r7
            return
    }

    public /* synthetic */ SpliceInsertCommand(android.os.Parcel r1, com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand parseFromSection(com.google.android.exoplayer2.util.ParsableByteArray r27, long r28, com.google.android.exoplayer2.util.TimestampAdjuster r30) {
            r0 = r30
            long r2 = r27.readUnsignedInt()
            int r1 = r27.readUnsignedByte()
            r1 = r1 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L10
            r6 = 1
            goto L11
        L10:
            r6 = 0
        L11:
            java.util.List r1 = java.util.Collections.emptyList()
            if (r6 != 0) goto Lca
            int r9 = r27.readUnsignedByte()
            r10 = r9 & 128(0x80, float:1.8E-43)
            if (r10 == 0) goto L21
            r10 = 1
            goto L22
        L21:
            r10 = 0
        L22:
            r11 = r9 & 64
            if (r11 == 0) goto L28
            r11 = 1
            goto L29
        L28:
            r11 = 0
        L29:
            r12 = r9 & 32
            if (r12 == 0) goto L2f
            r12 = 1
            goto L30
        L2f:
            r12 = 0
        L30:
            r9 = r9 & 16
            if (r9 == 0) goto L36
            r9 = 1
            goto L37
        L36:
            r9 = 0
        L37:
            if (r11 == 0) goto L40
            if (r9 != 0) goto L40
            long r13 = com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand.parseSpliceTime(r27, r28)
            goto L45
        L40:
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L45:
            if (r11 != 0) goto L7b
            int r1 = r27.readUnsignedByte()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>(r1)
            r4 = 0
        L51:
            if (r4 >= r1) goto L7a
            int r18 = r27.readUnsignedByte()
            if (r9 != 0) goto L60
            long r19 = com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand.parseSpliceTime(r27, r28)
            r7 = r19
            goto L65
        L60:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L65:
            com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand$ComponentSplice r5 = new com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand$ComponentSplice
            long r21 = r0.adjustTsTimestamp(r7)
            r23 = 0
            r17 = r5
            r19 = r7
            r17.<init>(r18, r19, r21, r23)
            r15.add(r5)
            int r4 = r4 + 1
            goto L51
        L7a:
            r1 = r15
        L7b:
            if (r12 == 0) goto La6
            int r4 = r27.readUnsignedByte()
            long r4 = (long) r4
            r7 = 128(0x80, double:6.3E-322)
            long r7 = r7 & r4
            r17 = 0
            int r12 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r12 == 0) goto L8e
            r16 = 1
            goto L90
        L8e:
            r16 = 0
        L90:
            r7 = 1
            long r4 = r4 & r7
            r7 = 32
            long r4 = r4 << r7
            long r7 = r27.readUnsignedInt()
            long r4 = r4 | r7
            r7 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r7
            r7 = 90
            long r7 = r4 / r7
            r5 = r16
            goto Lac
        La6:
            r5 = 0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        Lac:
            int r4 = r27.readUnsignedShort()
            int r12 = r27.readUnsignedByte()
            int r15 = r27.readUnsignedByte()
            r16 = r4
            r24 = r11
            r17 = r12
            r18 = r15
            r12 = r1
            r25 = r13
            r13 = r5
            r14 = r7
            r7 = r9
            r5 = r10
            r8 = r25
            goto Le0
        Lca:
            r12 = r1
            r5 = 0
            r7 = 0
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r13 = 0
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r16 = 0
            r17 = 0
            r18 = 0
            r24 = 0
        Le0:
            com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand r19 = new com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand
            r1 = r19
            long r10 = r0.adjustTsTimestamp(r8)
            r4 = r6
            r6 = r24
            r1.<init>(r2, r4, r5, r6, r7, r8, r10, r12, r13, r14, r16, r17, r18)
            return r19
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            long r0 = r2.spliceEventId
            r3.writeLong(r0)
            boolean r4 = r2.spliceEventCancelIndicator
            byte r4 = (byte) r4
            r3.writeByte(r4)
            boolean r4 = r2.outOfNetworkIndicator
            byte r4 = (byte) r4
            r3.writeByte(r4)
            boolean r4 = r2.programSpliceFlag
            byte r4 = (byte) r4
            r3.writeByte(r4)
            boolean r4 = r2.spliceImmediateFlag
            byte r4 = (byte) r4
            r3.writeByte(r4)
            long r0 = r2.programSplicePts
            r3.writeLong(r0)
            long r0 = r2.programSplicePlaybackPositionUs
            r3.writeLong(r0)
            java.util.List<com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand$ComponentSplice> r4 = r2.componentSpliceList
            int r4 = r4.size()
            r3.writeInt(r4)
            r0 = 0
        L31:
            if (r0 >= r4) goto L41
            java.util.List<com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand$ComponentSplice> r1 = r2.componentSpliceList
            java.lang.Object r1 = r1.get(r0)
            com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand$ComponentSplice r1 = (com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand.ComponentSplice) r1
            r1.writeToParcel(r3)
            int r0 = r0 + 1
            goto L31
        L41:
            boolean r4 = r2.autoReturn
            byte r4 = (byte) r4
            r3.writeByte(r4)
            long r0 = r2.breakDurationUs
            r3.writeLong(r0)
            int r4 = r2.uniqueProgramId
            r3.writeInt(r4)
            int r4 = r2.availNum
            r3.writeInt(r4)
            int r4 = r2.availsExpected
            r3.writeInt(r4)
            return
    }
}
