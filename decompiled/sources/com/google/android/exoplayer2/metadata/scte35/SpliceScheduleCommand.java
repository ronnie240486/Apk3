package com.google.android.exoplayer2.metadata.scte35;

/* JADX INFO: loaded from: classes.dex */
public final class SpliceScheduleCommand extends com.google.android.exoplayer2.metadata.scte35.SpliceCommand {
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand> CREATOR = null;
    public final java.util.List<com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand.Event> events;


    public static final class ComponentSplice {
        public final int componentTag;
        public final long utcSpliceTime;

        private ComponentSplice(int r1, long r2) {
                r0 = this;
                r0.<init>()
                r0.componentTag = r1
                r0.utcSpliceTime = r2
                return
        }

        public /* synthetic */ ComponentSplice(int r1, long r2, com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand.AnonymousClass1 r4) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static /* synthetic */ com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand.ComponentSplice access$000(android.os.Parcel r0) {
                com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$ComponentSplice r0 = createFromParcel(r0)
                return r0
        }

        public static /* synthetic */ void access$200(com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand.ComponentSplice r0, android.os.Parcel r1) {
                r0.writeToParcel(r1)
                return
        }

        private static com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand.ComponentSplice createFromParcel(android.os.Parcel r4) {
                com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$ComponentSplice r0 = new com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$ComponentSplice
                int r1 = r4.readInt()
                long r2 = r4.readLong()
                r0.<init>(r1, r2)
                return r0
        }

        private void writeToParcel(android.os.Parcel r3) {
                r2 = this;
                int r0 = r2.componentTag
                r3.writeInt(r0)
                long r0 = r2.utcSpliceTime
                r3.writeLong(r0)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class Event {
        public final boolean autoReturn;
        public final int availNum;
        public final int availsExpected;
        public final long breakDurationUs;
        public final java.util.List<com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand.ComponentSplice> componentSpliceList;
        public final boolean outOfNetworkIndicator;
        public final boolean programSpliceFlag;
        public final boolean spliceEventCancelIndicator;
        public final long spliceEventId;
        public final int uniqueProgramId;
        public final long utcSpliceTime;

        private Event(long r1, boolean r3, boolean r4, boolean r5, java.util.List<com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand.ComponentSplice> r6, long r7, boolean r9, long r10, int r12, int r13, int r14) {
                r0 = this;
                r0.<init>()
                r0.spliceEventId = r1
                r0.spliceEventCancelIndicator = r3
                r0.outOfNetworkIndicator = r4
                r0.programSpliceFlag = r5
                java.util.List r1 = java.util.Collections.unmodifiableList(r6)
                r0.componentSpliceList = r1
                r0.utcSpliceTime = r7
                r0.autoReturn = r9
                r0.breakDurationUs = r10
                r0.uniqueProgramId = r12
                r0.availNum = r13
                r0.availsExpected = r14
                return
        }

        private Event(android.os.Parcel r7) {
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
                int r0 = r7.readInt()
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>(r0)
                r4 = 0
            L36:
                if (r4 >= r0) goto L42
                com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$ComponentSplice r5 = com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand.ComponentSplice.access$000(r7)
                r3.add(r5)
                int r4 = r4 + 1
                goto L36
            L42:
                java.util.List r0 = java.util.Collections.unmodifiableList(r3)
                r6.componentSpliceList = r0
                long r3 = r7.readLong()
                r6.utcSpliceTime = r3
                byte r0 = r7.readByte()
                if (r0 != r2) goto L55
                r1 = 1
            L55:
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

        public static /* synthetic */ com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand.Event access$300(android.os.Parcel r0) {
                com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$Event r0 = createFromParcel(r0)
                return r0
        }

        public static /* synthetic */ com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand.Event access$400(com.google.android.exoplayer2.util.ParsableByteArray r0) {
                com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$Event r0 = parseFromSection(r0)
                return r0
        }

        public static /* synthetic */ void access$500(com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand.Event r0, android.os.Parcel r1) {
                r0.writeToParcel(r1)
                return
        }

        private static com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand.Event createFromParcel(android.os.Parcel r1) {
                com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$Event r0 = new com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$Event
                r0.<init>(r1)
                return r0
        }

        private static com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand.Event parseFromSection(com.google.android.exoplayer2.util.ParsableByteArray r21) {
                long r1 = r21.readUnsignedInt()
                int r0 = r21.readUnsignedByte()
                r0 = r0 & 128(0x80, float:1.8E-43)
                if (r0 == 0) goto Le
                r5 = 1
                goto Lf
            Le:
                r5 = 0
            Lf:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                if (r5 != 0) goto Laf
                int r8 = r21.readUnsignedByte()
                r9 = r8 & 128(0x80, float:1.8E-43)
                if (r9 == 0) goto L20
                r9 = 1
                goto L21
            L20:
                r9 = 0
            L21:
                r10 = r8 & 64
                if (r10 == 0) goto L27
                r10 = 1
                goto L28
            L27:
                r10 = 0
            L28:
                r11 = 32
                r8 = r8 & r11
                if (r8 == 0) goto L2f
                r8 = 1
                goto L30
            L2f:
                r8 = 0
            L30:
                if (r10 == 0) goto L37
                long r12 = r21.readUnsignedInt()
                goto L3c
            L37:
                r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            L3c:
                if (r10 != 0) goto L61
                int r0 = r21.readUnsignedByte()
                java.util.ArrayList r14 = new java.util.ArrayList
                r14.<init>(r0)
                r15 = 0
            L48:
                if (r15 >= r0) goto L60
                int r3 = r21.readUnsignedByte()
                long r6 = r21.readUnsignedInt()
                com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$ComponentSplice r4 = new com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$ComponentSplice
                r11 = 0
                r4.<init>(r3, r6, r11)
                r14.add(r4)
                int r15 = r15 + 1
                r11 = 32
                goto L48
            L60:
                r0 = r14
            L61:
                if (r8 == 0) goto L8c
                int r3 = r21.readUnsignedByte()
                long r3 = (long) r3
                r6 = 128(0x80, double:6.3E-322)
                long r6 = r6 & r3
                r14 = 0
                int r8 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
                if (r8 == 0) goto L74
                r16 = 1
                goto L76
            L74:
                r16 = 0
            L76:
                r6 = 1
                long r3 = r3 & r6
                r6 = 32
                long r3 = r3 << r6
                long r6 = r21.readUnsignedInt()
                long r3 = r3 | r6
                r6 = 1000(0x3e8, double:4.94E-321)
                long r3 = r3 * r6
                r6 = 90
                long r6 = r3 / r6
                r4 = r16
                goto L92
            L8c:
                r4 = 0
                r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            L92:
                int r3 = r21.readUnsignedShort()
                int r8 = r21.readUnsignedByte()
                int r11 = r21.readUnsignedByte()
                r17 = r10
                r14 = r11
                r10 = r6
                r6 = r0
                r18 = r12
                r12 = r3
                r13 = r8
                r7 = r18
                r20 = r9
                r9 = r4
                r4 = r20
                goto Lc1
            Laf:
                r6 = r0
                r4 = 0
                r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r9 = 0
                r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r12 = 0
                r13 = 0
                r14 = 0
                r17 = 0
            Lc1:
                com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$Event r15 = new com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$Event
                r0 = r15
                r3 = r5
                r5 = r17
                r0.<init>(r1, r3, r4, r5, r6, r7, r9, r10, r12, r13, r14)
                return r15
        }

        private void writeToParcel(android.os.Parcel r4) {
                r3 = this;
                long r0 = r3.spliceEventId
                r4.writeLong(r0)
                boolean r0 = r3.spliceEventCancelIndicator
                byte r0 = (byte) r0
                r4.writeByte(r0)
                boolean r0 = r3.outOfNetworkIndicator
                byte r0 = (byte) r0
                r4.writeByte(r0)
                boolean r0 = r3.programSpliceFlag
                byte r0 = (byte) r0
                r4.writeByte(r0)
                java.util.List<com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$ComponentSplice> r0 = r3.componentSpliceList
                int r0 = r0.size()
                r4.writeInt(r0)
                r1 = 0
            L21:
                if (r1 >= r0) goto L31
                java.util.List<com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$ComponentSplice> r2 = r3.componentSpliceList
                java.lang.Object r2 = r2.get(r1)
                com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$ComponentSplice r2 = (com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand.ComponentSplice) r2
                com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand.ComponentSplice.access$200(r2, r4)
                int r1 = r1 + 1
                goto L21
            L31:
                long r0 = r3.utcSpliceTime
                r4.writeLong(r0)
                boolean r0 = r3.autoReturn
                byte r0 = (byte) r0
                r4.writeByte(r0)
                long r0 = r3.breakDurationUs
                r4.writeLong(r0)
                int r0 = r3.uniqueProgramId
                r4.writeInt(r0)
                int r0 = r3.availNum
                r4.writeInt(r0)
                int r0 = r3.availsExpected
                r4.writeInt(r0)
                return
        }
    }

    static {
            com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$1 r0 = new com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$1
            r0.<init>()
            com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand.CREATOR = r0
            return
    }

    private SpliceScheduleCommand(android.os.Parcel r5) {
            r4 = this;
            r4.<init>()
            int r0 = r5.readInt()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2 = 0
        Ld:
            if (r2 >= r0) goto L19
            com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$Event r3 = com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand.Event.access$300(r5)
            r1.add(r3)
            int r2 = r2 + 1
            goto Ld
        L19:
            java.util.List r5 = java.util.Collections.unmodifiableList(r1)
            r4.events = r5
            return
    }

    public /* synthetic */ SpliceScheduleCommand(android.os.Parcel r1, com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private SpliceScheduleCommand(java.util.List<com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand.Event> r1) {
            r0 = this;
            r0.<init>()
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r0.events = r1
            return
    }

    public static com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand parseFromSection(com.google.android.exoplayer2.util.ParsableByteArray r4) {
            int r0 = r4.readUnsignedByte()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2 = 0
        La:
            if (r2 >= r0) goto L16
            com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$Event r3 = com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand.Event.access$400(r4)
            r1.add(r3)
            int r2 = r2 + 1
            goto La
        L16:
            com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand r4 = new com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand
            r4.<init>(r1)
            return r4
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            java.util.List<com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$Event> r4 = r2.events
            int r4 = r4.size()
            r3.writeInt(r4)
            r0 = 0
        La:
            if (r0 >= r4) goto L1a
            java.util.List<com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$Event> r1 = r2.events
            java.lang.Object r1 = r1.get(r0)
            com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$Event r1 = (com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand.Event) r1
            com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand.Event.access$500(r1, r3)
            int r0 = r0 + 1
            goto La
        L1a:
            return
    }
}
