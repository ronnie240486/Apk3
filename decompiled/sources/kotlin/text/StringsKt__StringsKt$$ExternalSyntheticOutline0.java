package kotlin.text;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class StringsKt__StringsKt$$ExternalSyntheticOutline0 {
    public static int m(java.lang.CharSequence r0, java.lang.String r1, kotlin.jvm.functions.Function1 r2, java.lang.String r3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            int r0 = r0.length()
            return r0
    }

    public static int m(java.lang.String r0, int r1) {
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r0 = r0.length()
            int r0 = r0 + r1
            return r0
    }

    public static int m(kotlin.UInt r0, int r1) {
            int r0 = r0.m478unboximpl()
            int r0 = r0 + r1
            int r0 = kotlin.UInt.m427constructorimpl(r0)
            return r0
    }

    public static int m(kotlin.ranges.IntRange r0, int r1) {
            java.lang.Integer r0 = r0.getEndInclusive()
            int r0 = r0.intValue()
            int r0 = r0 + r1
            return r0
    }

    public static com.google.android.play.core.tasks.zzi m(com.google.android.play.core.internal.zzag r0, java.lang.String r1, java.lang.Object[] r2) {
            r0.zzd(r1, r2)
            com.google.android.play.core.tasks.zzi r0 = new com.google.android.play.core.tasks.zzi
            r0.<init>()
            return r0
    }

    public static java.lang.IllegalArgumentException m(android.util.JsonReader r0, java.lang.String r1) {
            r0.skipValue()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            return r0
    }

    public static java.lang.Integer m(java.util.HashMap r0, java.lang.Integer r1, java.lang.String r2, int r3, java.lang.String r4) {
            r0.put(r1, r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0.put(r1, r4)
            return r1
    }

    public static java.lang.Object m(java.lang.CharSequence r0, int r1, kotlin.jvm.functions.Function1 r2) {
            char r0 = r0.charAt(r1)
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            java.lang.Object r0 = r2.invoke(r0)
            return r0
    }

    public static java.lang.Object m(byte[] r0, int r1, kotlin.jvm.functions.Function1 r2) {
            byte r0 = kotlin.UByteArray.m408getw2LRezQ(r0, r1)
            kotlin.UByte r0 = kotlin.UByte.m345boximpl(r0)
            java.lang.Object r0 = r2.invoke(r0)
            return r0
    }

    public static java.lang.Object m(int[] r0, int r1, kotlin.jvm.functions.Function1 r2) {
            int r0 = kotlin.UIntArray.m486getpVg5ArA(r0, r1)
            kotlin.UInt r0 = kotlin.UInt.m421boximpl(r0)
            java.lang.Object r0 = r2.invoke(r0)
            return r0
    }

    public static java.lang.Object m(long[] r0, int r1, kotlin.jvm.functions.Function1 r2) {
            long r0 = kotlin.ULongArray.m564getsVKNKU(r0, r1)
            kotlin.ULong r0 = kotlin.ULong.m499boximpl(r0)
            java.lang.Object r0 = r2.invoke(r0)
            return r0
    }

    public static java.lang.Object m(short[] r0, int r1, kotlin.jvm.functions.Function1 r2) {
            short r0 = kotlin.UShortArray.m668getMh2AYeg(r0, r1)
            kotlin.UShort r0 = kotlin.UShort.m605boximpl(r0)
            java.lang.Object r0 = r2.invoke(r0)
            return r0
    }

    public static java.lang.String m(int r1, java.lang.String r2, int r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static java.lang.String m(int r1, java.lang.String r2, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static java.lang.String m(int r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            r0.append(r3)
            r0.append(r4)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static java.lang.String m(int r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            r0.append(r3)
            r0.append(r4)
            r0.append(r5)
            java.lang.String r1 = r0.toString()
            return r1
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static java.lang.StringBuilder m1624m(int r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            r0.append(r3)
            r0.append(r4)
            r0.append(r5)
            return r0
    }

    public static java.util.ArrayList m(java.util.LinkedHashMap r1, java.lang.Object r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.put(r2, r0)
            return r0
    }

    public static java.util.ArrayList m(java.util.Map r1, java.lang.Object r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.put(r2, r0)
            return r0
    }

    public static java.util.Iterator m(java.lang.Iterable r0, java.lang.String r1, kotlin.jvm.functions.Function1 r2, java.lang.String r3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    public static java.util.Iterator m(kotlin.sequences.Sequence r0, java.lang.String r1, kotlin.jvm.functions.Function1 r2, java.lang.String r3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    public static kotlin.KotlinNothingValueException m() {
            kotlinx.coroutines.flow.FlowKt.noImpl()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            return r0
    }

    public static kotlin.collections.IntIterator m(int r1, int r2) {
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            r0.<init>(r1, r2)
            kotlin.collections.IntIterator r1 = r0.iterator2()
            return r1
    }

    public static void m(java.lang.StringBuilder r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0.append(r1)
            r0.append(r2)
            r0.append(r3)
            r0.append(r4)
            return
    }
}
