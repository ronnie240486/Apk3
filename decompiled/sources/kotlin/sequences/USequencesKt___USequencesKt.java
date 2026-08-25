package kotlin.sequences;

/* JADX INFO: compiled from: _USequences.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001c\u0010\u0000\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\n0\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"sum", "Lkotlin/UInt;", "Lkotlin/sequences/Sequence;", "Lkotlin/UByte;", "sumOfUByte", "(Lkotlin/sequences/Sequence;)I", "sumOfUInt", "Lkotlin/ULong;", "sumOfULong", "(Lkotlin/sequences/Sequence;)J", "Lkotlin/UShort;", "sumOfUShort", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/sequences/USequencesKt")
class USequencesKt___USequencesKt {
    public USequencesKt___USequencesKt() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.WasExperimental(markerClass = {kotlin.ExperimentalUnsignedTypes.class})
    @kotlin.jvm.JvmName(name = "sumOfUByte")
    public static final int sumOfUByte(@org.jetbrains.annotations.NotNull kotlin.sequences.Sequence<kotlin.UByte> r2) {
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
    public static final int sumOfUInt(@org.jetbrains.annotations.NotNull kotlin.sequences.Sequence<kotlin.UInt> r2) {
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
    public static final long sumOfULong(@org.jetbrains.annotations.NotNull kotlin.sequences.Sequence<kotlin.ULong> r4) {
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
    public static final int sumOfUShort(@org.jetbrains.annotations.NotNull kotlin.sequences.Sequence<kotlin.UShort> r3) {
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
}
