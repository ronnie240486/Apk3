package kotlin.collections.builders;

/* JADX INFO: compiled from: MapBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0015\u0012\u000e\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0016\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lkotlin/collections/builders/SerializedMap;", "Ljava/io/Externalizable;", "()V", "map", "", "(Ljava/util/Map;)V", "readExternal", "", "input", "Ljava/io/ObjectInput;", "readResolve", "", "writeExternal", "output", "Ljava/io/ObjectOutput;", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
final class SerializedMap implements java.io.Externalizable {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.collections.builders.SerializedMap.Companion Companion = null;
    private static final long serialVersionUID = 0;

    @org.jetbrains.annotations.NotNull
    private java.util.Map<?, ?> map;

    /* JADX INFO: compiled from: MapBuilder.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlin/collections/builders/SerializedMap$Companion;", "", "()V", "serialVersionUID", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            kotlin.collections.builders.SerializedMap$Companion r0 = new kotlin.collections.builders.SerializedMap$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.collections.builders.SerializedMap.Companion = r0
            return
    }

    public SerializedMap() {
            r1 = this;
            java.util.Map r0 = kotlin.collections.MapsKt.emptyMap()
            r1.<init>(r0)
            return
    }

    public SerializedMap(@org.jetbrains.annotations.NotNull java.util.Map<?, ?> r2) {
            r1 = this;
            java.lang.String r0 = "map"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.map = r2
            return
    }

    private final java.lang.Object readResolve() {
            r1 = this;
            java.util.Map<?, ?> r0 = r1.map
            return r0
    }

    @Override // java.io.Externalizable
    public void readExternal(@org.jetbrains.annotations.NotNull java.io.ObjectInput r6) {
            r5 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            byte r0 = r6.readByte()
            if (r0 != 0) goto L49
            int r0 = r6.readInt()
            if (r0 < 0) goto L2d
            java.util.Map r1 = kotlin.collections.MapsKt.createMapBuilder(r0)
            r2 = 0
        L16:
            if (r2 >= r0) goto L26
            java.lang.Object r3 = r6.readObject()
            java.lang.Object r4 = r6.readObject()
            r1.put(r3, r4)
            int r2 = r2 + 1
            goto L16
        L26:
            java.util.Map r6 = kotlin.collections.MapsKt.build(r1)
            r5.map = r6
            return
        L2d:
            java.io.InvalidObjectException r6 = new java.io.InvalidObjectException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Illegal size value: "
            r1.append(r2)
            r1.append(r0)
            r0 = 46
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r6.<init>(r0)
            throw r6
        L49:
            java.io.InvalidObjectException r6 = new java.io.InvalidObjectException
            java.lang.String r1 = "Unsupported flags value: "
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r0)
            r6.<init>(r0)
            throw r6
    }

    @Override // java.io.Externalizable
    public void writeExternal(@org.jetbrains.annotations.NotNull java.io.ObjectOutput r4) {
            r3 = this;
            java.lang.String r0 = "output"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            r4.writeByte(r0)
            java.util.Map<?, ?> r0 = r3.map
            int r0 = r0.size()
            r4.writeInt(r0)
            java.util.Map<?, ?> r0 = r3.map
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            r4.writeObject(r2)
            java.lang.Object r1 = r1.getValue()
            r4.writeObject(r1)
            goto L1c
        L37:
            return
    }
}
