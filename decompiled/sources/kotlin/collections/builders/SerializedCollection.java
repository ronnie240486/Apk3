package kotlin.collections.builders;

/* JADX INFO: compiled from: ListBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0019\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0012\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lkotlin/collections/builders/SerializedCollection;", "Ljava/io/Externalizable;", "()V", "collection", "", "tag", "", "(Ljava/util/Collection;I)V", "readExternal", "", "input", "Ljava/io/ObjectInput;", "readResolve", "", "writeExternal", "output", "Ljava/io/ObjectOutput;", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SerializedCollection implements java.io.Externalizable {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.collections.builders.SerializedCollection.Companion Companion = null;
    private static final long serialVersionUID = 0;
    public static final int tagList = 0;
    public static final int tagSet = 1;

    @org.jetbrains.annotations.NotNull
    private java.util.Collection<?> collection;
    private final int tag;

    /* JADX INFO: compiled from: ListBuilder.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lkotlin/collections/builders/SerializedCollection$Companion;", "", "()V", "serialVersionUID", "", "tagList", "", "tagSet", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
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
            kotlin.collections.builders.SerializedCollection$Companion r0 = new kotlin.collections.builders.SerializedCollection$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.collections.builders.SerializedCollection.Companion = r0
            return
    }

    public SerializedCollection() {
            r2 = this;
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            r1 = 0
            r2.<init>(r0, r1)
            return
    }

    public SerializedCollection(@org.jetbrains.annotations.NotNull java.util.Collection<?> r2, int r3) {
            r1 = this;
            java.lang.String r0 = "collection"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.collection = r2
            r1.tag = r3
            return
    }

    private final java.lang.Object readResolve() {
            r1 = this;
            java.util.Collection<?> r0 = r1.collection
            return r0
    }

    @Override // java.io.Externalizable
    public void readExternal(@org.jetbrains.annotations.NotNull java.io.ObjectInput r6) {
            r5 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            byte r0 = r6.readByte()
            r1 = r0 & 1
            r2 = r0 & (-2)
            r3 = 46
            if (r2 != 0) goto L7d
            int r0 = r6.readInt()
            if (r0 < 0) goto L63
            r2 = 0
            if (r1 == 0) goto L4c
            r4 = 1
            if (r1 != r4) goto L32
            java.util.Set r1 = kotlin.collections.SetsKt.createSetBuilder(r0)
        L21:
            if (r2 >= r0) goto L2d
            java.lang.Object r3 = r6.readObject()
            r1.add(r3)
            int r2 = r2 + 1
            goto L21
        L2d:
            java.util.Set r6 = kotlin.collections.SetsKt.build(r1)
            goto L60
        L32:
            java.io.InvalidObjectException r6 = new java.io.InvalidObjectException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Unsupported collection type tag: "
            r0.append(r2)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L4c:
            java.util.List r1 = kotlin.collections.CollectionsKt.createListBuilder(r0)
        L50:
            if (r2 >= r0) goto L5c
            java.lang.Object r3 = r6.readObject()
            r1.add(r3)
            int r2 = r2 + 1
            goto L50
        L5c:
            java.util.List r6 = kotlin.collections.CollectionsKt.build(r1)
        L60:
            r5.collection = r6
            return
        L63:
            java.io.InvalidObjectException r6 = new java.io.InvalidObjectException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Illegal size value: "
            r1.append(r2)
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            r6.<init>(r0)
            throw r6
        L7d:
            java.io.InvalidObjectException r6 = new java.io.InvalidObjectException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unsupported flags value: "
            r1.append(r2)
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            r6.<init>(r0)
            throw r6
    }

    @Override // java.io.Externalizable
    public void writeExternal(@org.jetbrains.annotations.NotNull java.io.ObjectOutput r3) {
            r2 = this;
            java.lang.String r0 = "output"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r2.tag
            r3.writeByte(r0)
            java.util.Collection<?> r0 = r2.collection
            int r0 = r0.size()
            r3.writeInt(r0)
            java.util.Collection<?> r0 = r2.collection
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r0.next()
            r3.writeObject(r1)
            goto L19
        L27:
            return
    }
}
