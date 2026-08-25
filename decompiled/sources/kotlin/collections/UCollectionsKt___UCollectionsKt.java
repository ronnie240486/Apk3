package kotlin.collections;

/* JADX INFO: compiled from: _UCollections.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001c\u0010\u0000\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\n0\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0005\u001a\u001a\u0010\f\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\u00030\u000eH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a\u001a\u0010\u0010\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001a\u001a\u0010\u0013\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00020\u00070\u000eH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001a\u001a\u0010\u0016\u001a\u00020\u0017*\b\u0012\u0004\u0012\u00020\n0\u000eH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"sum", "Lkotlin/UInt;", "", "Lkotlin/UByte;", "sumOfUByte", "(Ljava/lang/Iterable;)I", "sumOfUInt", "Lkotlin/ULong;", "sumOfULong", "(Ljava/lang/Iterable;)J", "Lkotlin/UShort;", "sumOfUShort", "toUByteArray", "Lkotlin/UByteArray;", "", "(Ljava/util/Collection;)[B", "toUIntArray", "Lkotlin/UIntArray;", "(Ljava/util/Collection;)[I", "toULongArray", "Lkotlin/ULongArray;", "(Ljava/util/Collection;)[J", "toUShortArray", "Lkotlin/UShortArray;", "(Ljava/util/Collection;)[S", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/collections/UCollectionsKt")
class UCollectionsKt___UCollectionsKt {
    public UCollectionsKt___UCollectionsKt() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class})
    @kotlin.jvm.JvmName(name = "sumOfUByte")
    public static final int sumOfUByte(@org.jetbrains.annotations.NotNull java.lang.Iterable<kotlin.UByte> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.Iterator r2 = r2.iterator()
            r0 = 0
        La:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r2.next()
            kotlin.UByte r1 = (kotlin.UByte) r1
            byte r1 = r1.m400unboximpl()
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = kotlin.UInt.m427constructorimpl(r1)
            int r1 = r1 + r0
            int r0 = kotlin.UInt.m427constructorimpl(r1)
            goto La
        L26:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class})
    @kotlin.jvm.JvmName(name = "sumOfUInt")
    public static final int sumOfUInt(@org.jetbrains.annotations.NotNull java.lang.Iterable<kotlin.UInt> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.Iterator r2 = r2.iterator()
            r0 = 0
        La:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r2.next()
            kotlin.UInt r1 = (kotlin.UInt) r1
            int r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r0)
            goto La
        L1b:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class})
    @kotlin.jvm.JvmName(name = "sumOfULong")
    public static final long sumOfULong(@org.jetbrains.annotations.NotNull java.lang.Iterable<kotlin.ULong> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
        Lb:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L21
            java.lang.Object r2 = r4.next()
            kotlin.ULong r2 = (kotlin.ULong) r2
            long r2 = r2.m556unboximpl()
            long r2 = r2 + r0
            long r0 = kotlin.ULong.m505constructorimpl(r2)
            goto Lb
        L21:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class})
    @kotlin.jvm.JvmName(name = "sumOfUShort")
    public static final int sumOfUShort(@org.jetbrains.annotations.NotNull java.lang.Iterable<kotlin.UShort> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        La:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r3.next()
            kotlin.UShort r1 = (kotlin.UShort) r1
            short r1 = r1.m660unboximpl()
            r2 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r2
            int r1 = kotlin.UInt.m427constructorimpl(r1)
            int r1 = r1 + r0
            int r0 = kotlin.UInt.m427constructorimpl(r1)
            goto La
        L28:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @org.jetbrains.annotations.NotNull
    public static final byte[] toUByteArray(@org.jetbrains.annotations.NotNull java.util.Collection<kotlin.UByte> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r4.size()
            byte[] r0 = kotlin.UByteArray.m402constructorimpl(r0)
            java.util.Iterator r4 = r4.iterator()
            r1 = 0
        L12:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r4.next()
            kotlin.UByte r2 = (kotlin.UByte) r2
            byte r2 = r2.m400unboximpl()
            int r3 = r1 + 1
            kotlin.UByteArray.m413setVurrAj0(r0, r1, r2)
            r1 = r3
            goto L12
        L29:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @org.jetbrains.annotations.NotNull
    public static final int[] toUIntArray(@org.jetbrains.annotations.NotNull java.util.Collection<kotlin.UInt> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r4.size()
            int[] r0 = kotlin.UIntArray.m480constructorimpl(r0)
            java.util.Iterator r4 = r4.iterator()
            r1 = 0
        L12:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r4.next()
            kotlin.UInt r2 = (kotlin.UInt) r2
            int r2 = r2.m478unboximpl()
            int r3 = r1 + 1
            kotlin.UIntArray.m491setVXSXFK8(r0, r1, r2)
            r1 = r3
            goto L12
        L29:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @org.jetbrains.annotations.NotNull
    public static final long[] toULongArray(@org.jetbrains.annotations.NotNull java.util.Collection<kotlin.ULong> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int r0 = r5.size()
            long[] r0 = kotlin.ULongArray.m558constructorimpl(r0)
            java.util.Iterator r5 = r5.iterator()
            r1 = 0
        L12:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r5.next()
            kotlin.ULong r2 = (kotlin.ULong) r2
            long r2 = r2.m556unboximpl()
            int r4 = r1 + 1
            kotlin.ULongArray.m569setk8EXiF4(r0, r1, r2)
            r1 = r4
            goto L12
        L29:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.3")
    @kotlin.ExperimentalUnsignedTypes
    @org.jetbrains.annotations.NotNull
    public static final short[] toUShortArray(@org.jetbrains.annotations.NotNull java.util.Collection<kotlin.UShort> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r4.size()
            short[] r0 = kotlin.UShortArray.m662constructorimpl(r0)
            java.util.Iterator r4 = r4.iterator()
            r1 = 0
        L12:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r4.next()
            kotlin.UShort r2 = (kotlin.UShort) r2
            short r2 = r2.m660unboximpl()
            int r3 = r1 + 1
            kotlin.UShortArray.m673set01HTLdE(r0, r1, r2)
            r1 = r3
            goto L12
        L29:
            return r0
    }
}
