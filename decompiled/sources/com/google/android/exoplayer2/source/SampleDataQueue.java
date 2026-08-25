package com.google.android.exoplayer2.source;

/* JADX INFO: loaded from: classes2.dex */
class SampleDataQueue {
    private static final int INITIAL_SCRATCH_SIZE = 32;
    private final int allocationLength;
    private final com.google.android.exoplayer2.upstream.Allocator allocator;
    private com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode firstAllocationNode;
    private com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode readAllocationNode;
    private final com.google.android.exoplayer2.util.ParsableByteArray scratch;
    private long totalBytesWritten;
    private com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode writeAllocationNode;

    public static final class AllocationNode implements com.google.android.exoplayer2.upstream.Allocator.AllocationNode {

        @androidx.annotation.Nullable
        public com.google.android.exoplayer2.upstream.Allocation allocation;
        public long endPosition;

        @androidx.annotation.Nullable
        public com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode next;
        public long startPosition;

        public AllocationNode(long r1, int r3) {
                r0 = this;
                r0.<init>()
                r0.reset(r1, r3)
                return
        }

        public com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode clear() {
                r2 = this;
                r0 = 0
                r2.allocation = r0
                com.google.android.exoplayer2.source.SampleDataQueue$AllocationNode r1 = r2.next
                r2.next = r0
                return r1
        }

        @Override // com.google.android.exoplayer2.upstream.Allocator.AllocationNode
        public com.google.android.exoplayer2.upstream.Allocation getAllocation() {
                r1 = this;
                com.google.android.exoplayer2.upstream.Allocation r0 = r1.allocation
                java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
                com.google.android.exoplayer2.upstream.Allocation r0 = (com.google.android.exoplayer2.upstream.Allocation) r0
                return r0
        }

        public void initialize(com.google.android.exoplayer2.upstream.Allocation r1, com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode r2) {
                r0 = this;
                r0.allocation = r1
                r0.next = r2
                return
        }

        @Override // com.google.android.exoplayer2.upstream.Allocator.AllocationNode
        @androidx.annotation.Nullable
        public com.google.android.exoplayer2.upstream.Allocator.AllocationNode next() {
                r2 = this;
                com.google.android.exoplayer2.source.SampleDataQueue$AllocationNode r0 = r2.next
                if (r0 == 0) goto La
                com.google.android.exoplayer2.upstream.Allocation r1 = r0.allocation
                if (r1 != 0) goto L9
                goto La
            L9:
                return r0
            La:
                r0 = 0
                return r0
        }

        public void reset(long r3, int r5) {
                r2 = this;
                com.google.android.exoplayer2.upstream.Allocation r0 = r2.allocation
                if (r0 != 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                com.google.android.exoplayer2.util.Assertions.checkState(r0)
                r2.startPosition = r3
                long r0 = (long) r5
                long r3 = r3 + r0
                r2.endPosition = r3
                return
        }

        public int translateOffset(long r3) {
                r2 = this;
                long r0 = r2.startPosition
                long r3 = r3 - r0
                int r4 = (int) r3
                com.google.android.exoplayer2.upstream.Allocation r3 = r2.allocation
                int r3 = r3.offset
                int r4 = r4 + r3
                return r4
        }
    }

    public SampleDataQueue(com.google.android.exoplayer2.upstream.Allocator r4) {
            r3 = this;
            r3.<init>()
            r3.allocator = r4
            int r4 = r4.getIndividualAllocationLength()
            r3.allocationLength = r4
            com.google.android.exoplayer2.util.ParsableByteArray r0 = new com.google.android.exoplayer2.util.ParsableByteArray
            r1 = 32
            r0.<init>(r1)
            r3.scratch = r0
            com.google.android.exoplayer2.source.SampleDataQueue$AllocationNode r0 = new com.google.android.exoplayer2.source.SampleDataQueue$AllocationNode
            r1 = 0
            r0.<init>(r1, r4)
            r3.firstAllocationNode = r0
            r3.readAllocationNode = r0
            r3.writeAllocationNode = r0
            return
    }

    private void clearAllocationNodes(com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode r2) {
            r1 = this;
            com.google.android.exoplayer2.upstream.Allocation r0 = r2.allocation
            if (r0 != 0) goto L5
            return
        L5:
            com.google.android.exoplayer2.upstream.Allocator r0 = r1.allocator
            r0.release(r2)
            r2.clear()
            return
    }

    private static com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode getNodeContainingPosition(com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode r3, long r4) {
        L0:
            long r0 = r3.endPosition
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L9
            com.google.android.exoplayer2.source.SampleDataQueue$AllocationNode r3 = r3.next
            goto L0
        L9:
            return r3
    }

    private void postAppend(int r6) {
            r5 = this;
            long r0 = r5.totalBytesWritten
            long r2 = (long) r6
            long r0 = r0 + r2
            r5.totalBytesWritten = r0
            com.google.android.exoplayer2.source.SampleDataQueue$AllocationNode r6 = r5.writeAllocationNode
            long r2 = r6.endPosition
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L12
            com.google.android.exoplayer2.source.SampleDataQueue$AllocationNode r6 = r6.next
            r5.writeAllocationNode = r6
        L12:
            return
    }

    private int preAppend(int r7) {
            r6 = this;
            com.google.android.exoplayer2.source.SampleDataQueue$AllocationNode r0 = r6.writeAllocationNode
            com.google.android.exoplayer2.upstream.Allocation r1 = r0.allocation
            if (r1 != 0) goto L1a
            com.google.android.exoplayer2.upstream.Allocator r1 = r6.allocator
            com.google.android.exoplayer2.upstream.Allocation r1 = r1.allocate()
            com.google.android.exoplayer2.source.SampleDataQueue$AllocationNode r2 = new com.google.android.exoplayer2.source.SampleDataQueue$AllocationNode
            com.google.android.exoplayer2.source.SampleDataQueue$AllocationNode r3 = r6.writeAllocationNode
            long r3 = r3.endPosition
            int r5 = r6.allocationLength
            r2.<init>(r3, r5)
            r0.initialize(r1, r2)
        L1a:
            com.google.android.exoplayer2.source.SampleDataQueue$AllocationNode r0 = r6.writeAllocationNode
            long r0 = r0.endPosition
            long r2 = r6.totalBytesWritten
            long r0 = r0 - r2
            int r1 = (int) r0
            int r7 = java.lang.Math.min(r7, r1)
            return r7
    }

    private static com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode readData(com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode r3, long r4, java.nio.ByteBuffer r6, int r7) {
            com.google.android.exoplayer2.source.SampleDataQueue$AllocationNode r3 = getNodeContainingPosition(r3, r4)
        L4:
            if (r7 <= 0) goto L25
            long r0 = r3.endPosition
            long r0 = r0 - r4
            int r1 = (int) r0
            int r0 = java.lang.Math.min(r7, r1)
            com.google.android.exoplayer2.upstream.Allocation r1 = r3.allocation
            byte[] r1 = r1.data
            int r2 = r3.translateOffset(r4)
            r6.put(r1, r2, r0)
            int r7 = r7 - r0
            long r0 = (long) r0
            long r4 = r4 + r0
            long r0 = r3.endPosition
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L4
            com.google.android.exoplayer2.source.SampleDataQueue$AllocationNode r3 = r3.next
            goto L4
        L25:
            return r3
    }

    private static com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode readData(com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode r5, long r6, byte[] r8, int r9) {
            com.google.android.exoplayer2.source.SampleDataQueue$AllocationNode r5 = getNodeContainingPosition(r5, r6)
            r0 = r9
        L5:
            if (r0 <= 0) goto L28
            long r1 = r5.endPosition
            long r1 = r1 - r6
            int r2 = (int) r1
            int r1 = java.lang.Math.min(r0, r2)
            com.google.android.exoplayer2.upstream.Allocation r2 = r5.allocation
            byte[] r2 = r2.data
            int r3 = r5.translateOffset(r6)
            int r4 = r9 - r0
            java.lang.System.arraycopy(r2, r3, r8, r4, r1)
            int r0 = r0 - r1
            long r1 = (long) r1
            long r6 = r6 + r1
            long r1 = r5.endPosition
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 != 0) goto L5
            com.google.android.exoplayer2.source.SampleDataQueue$AllocationNode r5 = r5.next
            goto L5
        L28:
            return r5
    }

    private static com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode readEncryptionData(com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode r18, com.google.android.exoplayer2.decoder.DecoderInputBuffer r19, com.google.android.exoplayer2.source.SampleQueue.SampleExtrasHolder r20, com.google.android.exoplayer2.util.ParsableByteArray r21) {
            r0 = r20
            r1 = r21
            long r2 = r0.offset
            r4 = 1
            r1.reset(r4)
            byte[] r5 = r21.getData()
            r6 = r18
            com.google.android.exoplayer2.source.SampleDataQueue$AllocationNode r5 = readData(r6, r2, r5, r4)
            r6 = 1
            long r2 = r2 + r6
            byte[] r6 = r21.getData()
            r7 = 0
            r6 = r6[r7]
            r8 = r6 & 128(0x80, float:1.8E-43)
            if (r8 == 0) goto L24
            r8 = 1
            goto L25
        L24:
            r8 = 0
        L25:
            r6 = r6 & 127(0x7f, float:1.78E-43)
            r9 = r19
            com.google.android.exoplayer2.decoder.CryptoInfo r9 = r9.cryptoInfo
            byte[] r10 = r9.iv
            if (r10 != 0) goto L36
            r10 = 16
            byte[] r10 = new byte[r10]
            r9.iv = r10
            goto L39
        L36:
            java.util.Arrays.fill(r10, r7)
        L39:
            byte[] r10 = r9.iv
            com.google.android.exoplayer2.source.SampleDataQueue$AllocationNode r5 = readData(r5, r2, r10, r6)
            long r10 = (long) r6
            long r2 = r2 + r10
            if (r8 == 0) goto L58
            r4 = 2
            r1.reset(r4)
            byte[] r6 = r21.getData()
            com.google.android.exoplayer2.source.SampleDataQueue$AllocationNode r5 = readData(r5, r2, r6, r4)
            r10 = 2
            long r2 = r2 + r10
            int r4 = r21.readUnsignedShort()
            r10 = r4
            goto L59
        L58:
            r10 = 1
        L59:
            int[] r4 = r9.numBytesOfClearData
            if (r4 == 0) goto L60
            int r6 = r4.length
            if (r6 >= r10) goto L62
        L60:
            int[] r4 = new int[r10]
        L62:
            r11 = r4
            int[] r4 = r9.numBytesOfEncryptedData
            if (r4 == 0) goto L6a
            int r6 = r4.length
            if (r6 >= r10) goto L6c
        L6a:
            int[] r4 = new int[r10]
        L6c:
            r12 = r4
            if (r8 == 0) goto L92
            int r4 = r10 * 6
            r1.reset(r4)
            byte[] r6 = r21.getData()
            com.google.android.exoplayer2.source.SampleDataQueue$AllocationNode r5 = readData(r5, r2, r6, r4)
            long r13 = (long) r4
            long r2 = r2 + r13
            r1.setPosition(r7)
        L81:
            if (r7 >= r10) goto L9e
            int r4 = r21.readUnsignedShort()
            r11[r7] = r4
            int r4 = r21.readUnsignedIntToInt()
            r12[r7] = r4
            int r7 = r7 + 1
            goto L81
        L92:
            r11[r7] = r7
            int r1 = r0.size
            long r13 = r0.offset
            long r13 = r2 - r13
            int r4 = (int) r13
            int r1 = r1 - r4
            r12[r7] = r1
        L9e:
            com.google.android.exoplayer2.extractor.TrackOutput$CryptoData r1 = r0.cryptoData
            java.lang.Object r1 = com.google.android.exoplayer2.util.Util.castNonNull(r1)
            com.google.android.exoplayer2.extractor.TrackOutput$CryptoData r1 = (com.google.android.exoplayer2.extractor.TrackOutput.CryptoData) r1
            byte[] r13 = r1.encryptionKey
            byte[] r14 = r9.iv
            int r15 = r1.cryptoMode
            int r4 = r1.encryptedBlocks
            int r1 = r1.clearBlocks
            r16 = r4
            r17 = r1
            r9.set(r10, r11, r12, r13, r14, r15, r16, r17)
            long r6 = r0.offset
            long r2 = r2 - r6
            int r1 = (int) r2
            long r2 = (long) r1
            long r6 = r6 + r2
            r0.offset = r6
            int r2 = r0.size
            int r2 = r2 - r1
            r0.size = r2
            return r5
    }

    private static com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode readSampleData(com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode r5, com.google.android.exoplayer2.decoder.DecoderInputBuffer r6, com.google.android.exoplayer2.source.SampleQueue.SampleExtrasHolder r7, com.google.android.exoplayer2.util.ParsableByteArray r8) {
            boolean r0 = r6.isEncrypted()
            if (r0 == 0) goto La
            com.google.android.exoplayer2.source.SampleDataQueue$AllocationNode r5 = readEncryptionData(r5, r6, r7, r8)
        La:
            boolean r0 = r6.hasSupplementalData()
            if (r0 == 0) goto L52
            r0 = 4
            r8.reset(r0)
            long r1 = r7.offset
            byte[] r3 = r8.getData()
            com.google.android.exoplayer2.source.SampleDataQueue$AllocationNode r5 = readData(r5, r1, r3, r0)
            int r8 = r8.readUnsignedIntToInt()
            long r1 = r7.offset
            r3 = 4
            long r1 = r1 + r3
            r7.offset = r1
            int r1 = r7.size
            int r1 = r1 - r0
            r7.size = r1
            r6.ensureSpaceForWrite(r8)
            long r0 = r7.offset
            java.nio.ByteBuffer r2 = r6.data
            com.google.android.exoplayer2.source.SampleDataQueue$AllocationNode r5 = readData(r5, r0, r2, r8)
            long r0 = r7.offset
            long r2 = (long) r8
            long r0 = r0 + r2
            r7.offset = r0
            int r0 = r7.size
            int r0 = r0 - r8
            r7.size = r0
            r6.resetSupplementalData(r0)
            long r0 = r7.offset
            java.nio.ByteBuffer r6 = r6.supplementalData
            int r7 = r7.size
            com.google.android.exoplayer2.source.SampleDataQueue$AllocationNode r5 = readData(r5, r0, r6, r7)
            goto L61
        L52:
            int r8 = r7.size
            r6.ensureSpaceForWrite(r8)
            long r0 = r7.offset
            java.nio.ByteBuffer r6 = r6.data
            int r7 = r7.size
            com.google.android.exoplayer2.source.SampleDataQueue$AllocationNode r5 = readData(r5, r0, r6, r7)
        L61:
            return r5
    }

    public void discardDownstreamTo(long r5) {
            r4 = this;
            r0 = -1
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 != 0) goto L7
            return
        L7:
            com.google.android.exoplayer2.source.SampleDataQueue$AllocationNode r0 = r4.firstAllocationNode
            long r1 = r0.endPosition
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 < 0) goto L1f
            com.google.android.exoplayer2.upstream.Allocator r1 = r4.allocator
            com.google.android.exoplayer2.upstream.Allocation r0 = r0.allocation
            r1.release(r0)
            com.google.android.exoplayer2.source.SampleDataQueue$AllocationNode r0 = r4.firstAllocationNode
            com.google.android.exoplayer2.source.SampleDataQueue$AllocationNode r0 = r0.clear()
            r4.firstAllocationNode = r0
            goto L7
        L1f:
            com.google.android.exoplayer2.source.SampleDataQueue$AllocationNode r5 = r4.readAllocationNode
            long r5 = r5.startPosition
            long r1 = r0.startPosition
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 >= 0) goto L2b
            r4.readAllocationNode = r0
        L2b:
            return
    }

    public void discardUpstreamSampleBytes(long r7) {
            r6 = this;
            long r0 = r6.totalBytesWritten
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 > 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
            r6.totalBytesWritten = r7
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L50
            com.google.android.exoplayer2.source.SampleDataQueue$AllocationNode r0 = r6.firstAllocationNode
            long r1 = r0.startPosition
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 != 0) goto L1d
            goto L50
        L1d:
            long r7 = r6.totalBytesWritten
            long r1 = r0.endPosition
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 <= 0) goto L28
            com.google.android.exoplayer2.source.SampleDataQueue$AllocationNode r0 = r0.next
            goto L1d
        L28:
            com.google.android.exoplayer2.source.SampleDataQueue$AllocationNode r7 = r0.next
            java.lang.Object r7 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r7)
            com.google.android.exoplayer2.source.SampleDataQueue$AllocationNode r7 = (com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode) r7
            r6.clearAllocationNodes(r7)
            com.google.android.exoplayer2.source.SampleDataQueue$AllocationNode r8 = new com.google.android.exoplayer2.source.SampleDataQueue$AllocationNode
            long r1 = r0.endPosition
            int r3 = r6.allocationLength
            r8.<init>(r1, r3)
            r0.next = r8
            long r1 = r6.totalBytesWritten
            long r3 = r0.endPosition
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L47
            r0 = r8
        L47:
            r6.writeAllocationNode = r0
            com.google.android.exoplayer2.source.SampleDataQueue$AllocationNode r0 = r6.readAllocationNode
            if (r0 != r7) goto L64
            r6.readAllocationNode = r8
            goto L64
        L50:
            com.google.android.exoplayer2.source.SampleDataQueue$AllocationNode r7 = r6.firstAllocationNode
            r6.clearAllocationNodes(r7)
            com.google.android.exoplayer2.source.SampleDataQueue$AllocationNode r7 = new com.google.android.exoplayer2.source.SampleDataQueue$AllocationNode
            long r0 = r6.totalBytesWritten
            int r8 = r6.allocationLength
            r7.<init>(r0, r8)
            r6.firstAllocationNode = r7
            r6.readAllocationNode = r7
            r6.writeAllocationNode = r7
        L64:
            return
    }

    public long getTotalBytesWritten() {
            r2 = this;
            long r0 = r2.totalBytesWritten
            return r0
    }

    public void peekToBuffer(com.google.android.exoplayer2.decoder.DecoderInputBuffer r3, com.google.android.exoplayer2.source.SampleQueue.SampleExtrasHolder r4) {
            r2 = this;
            com.google.android.exoplayer2.source.SampleDataQueue$AllocationNode r0 = r2.readAllocationNode
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r2.scratch
            readSampleData(r0, r3, r4, r1)
            return
    }

    public void readToBuffer(com.google.android.exoplayer2.decoder.DecoderInputBuffer r3, com.google.android.exoplayer2.source.SampleQueue.SampleExtrasHolder r4) {
            r2 = this;
            com.google.android.exoplayer2.source.SampleDataQueue$AllocationNode r0 = r2.readAllocationNode
            com.google.android.exoplayer2.util.ParsableByteArray r1 = r2.scratch
            com.google.android.exoplayer2.source.SampleDataQueue$AllocationNode r3 = readSampleData(r0, r3, r4, r1)
            r2.readAllocationNode = r3
            return
    }

    public void reset() {
            r4 = this;
            com.google.android.exoplayer2.source.SampleDataQueue$AllocationNode r0 = r4.firstAllocationNode
            r4.clearAllocationNodes(r0)
            com.google.android.exoplayer2.source.SampleDataQueue$AllocationNode r0 = r4.firstAllocationNode
            int r1 = r4.allocationLength
            r2 = 0
            r0.reset(r2, r1)
            com.google.android.exoplayer2.source.SampleDataQueue$AllocationNode r0 = r4.firstAllocationNode
            r4.readAllocationNode = r0
            r4.writeAllocationNode = r0
            r4.totalBytesWritten = r2
            com.google.android.exoplayer2.upstream.Allocator r0 = r4.allocator
            r0.trim()
            return
    }

    public void rewind() {
            r1 = this;
            com.google.android.exoplayer2.source.SampleDataQueue$AllocationNode r0 = r1.firstAllocationNode
            r1.readAllocationNode = r0
            return
    }

    public int sampleData(com.google.android.exoplayer2.upstream.DataReader r5, int r6, boolean r7) throws java.io.IOException {
            r4 = this;
            int r6 = r4.preAppend(r6)
            com.google.android.exoplayer2.source.SampleDataQueue$AllocationNode r0 = r4.writeAllocationNode
            com.google.android.exoplayer2.upstream.Allocation r1 = r0.allocation
            byte[] r1 = r1.data
            long r2 = r4.totalBytesWritten
            int r0 = r0.translateOffset(r2)
            int r5 = r5.read(r1, r0, r6)
            r6 = -1
            if (r5 != r6) goto L20
            if (r7 == 0) goto L1a
            return r6
        L1a:
            java.io.EOFException r5 = new java.io.EOFException
            r5.<init>()
            throw r5
        L20:
            r4.postAppend(r5)
            return r5
    }

    public void sampleData(com.google.android.exoplayer2.util.ParsableByteArray r6, int r7) {
            r5 = this;
        L0:
            if (r7 <= 0) goto L1a
            int r0 = r5.preAppend(r7)
            com.google.android.exoplayer2.source.SampleDataQueue$AllocationNode r1 = r5.writeAllocationNode
            com.google.android.exoplayer2.upstream.Allocation r2 = r1.allocation
            byte[] r2 = r2.data
            long r3 = r5.totalBytesWritten
            int r1 = r1.translateOffset(r3)
            r6.readBytes(r2, r1, r0)
            int r7 = r7 - r0
            r5.postAppend(r0)
            goto L0
        L1a:
            return
    }
}
