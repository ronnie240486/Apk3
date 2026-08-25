package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
public final class ParcelCompat {

    @androidx.annotation.RequiresApi(29)
    public static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static final <T extends android.os.Parcelable> java.util.List<T> readParcelableList(@androidx.annotation.NonNull android.os.Parcel r0, @androidx.annotation.NonNull java.util.List<T> r1, @androidx.annotation.Nullable java.lang.ClassLoader r2) {
                java.util.List r0 = r0.readParcelableList(r1, r2)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @androidx.annotation.RequiresApi(30)
    public static class Api30Impl {
        private Api30Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static final android.os.Parcelable.Creator<?> readParcelableCreator(@androidx.annotation.NonNull android.os.Parcel r0, @androidx.annotation.Nullable java.lang.ClassLoader r1) {
                android.os.Parcelable$Creator r0 = r0.readParcelableCreator(r1)
                return r0
        }
    }

    @androidx.annotation.RequiresApi(33)
    public static class TiramisuImpl {
        private TiramisuImpl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static <T> T[] readArray(android.os.Parcel r0, java.lang.ClassLoader r1, java.lang.Class<T> r2) {
                java.lang.Object[] r0 = r0.readArray(r1, r2)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static <T> java.util.ArrayList<T> readArrayList(android.os.Parcel r0, java.lang.ClassLoader r1, java.lang.Class<? extends T> r2) {
                java.util.ArrayList r0 = r0.readArrayList(r1, r2)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static <V, K> java.util.HashMap<K, V> readHashMap(android.os.Parcel r0, java.lang.ClassLoader r1, java.lang.Class<? extends K> r2, java.lang.Class<? extends V> r3) {
                java.util.HashMap r0 = r0.readHashMap(r1, r2, r3)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static <T> void readList(@androidx.annotation.NonNull android.os.Parcel r0, @androidx.annotation.NonNull java.util.List<? super T> r1, @androidx.annotation.Nullable java.lang.ClassLoader r2, @androidx.annotation.NonNull java.lang.Class<T> r3) {
                r0.readList(r1, r2, r3)
                return
        }

        @androidx.annotation.DoNotInline
        public static <K, V> void readMap(android.os.Parcel r0, java.util.Map<? super K, ? super V> r1, java.lang.ClassLoader r2, java.lang.Class<K> r3, java.lang.Class<V> r4) {
                r0.readMap(r1, r2, r3, r4)
                return
        }

        @androidx.annotation.DoNotInline
        public static <T extends android.os.Parcelable> T readParcelable(@androidx.annotation.NonNull android.os.Parcel r0, @androidx.annotation.Nullable java.lang.ClassLoader r1, @androidx.annotation.NonNull java.lang.Class<T> r2) {
                java.lang.Object r0 = r0.readParcelable(r1, r2)
                android.os.Parcelable r0 = (android.os.Parcelable) r0
                return r0
        }

        @androidx.annotation.DoNotInline
        public static <T> T[] readParcelableArray(@androidx.annotation.NonNull android.os.Parcel r0, @androidx.annotation.Nullable java.lang.ClassLoader r1, @androidx.annotation.NonNull java.lang.Class<T> r2) {
                java.lang.Object[] r0 = r0.readParcelableArray(r1, r2)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static <T> android.os.Parcelable.Creator<T> readParcelableCreator(android.os.Parcel r0, java.lang.ClassLoader r1, java.lang.Class<T> r2) {
                android.os.Parcelable$Creator r0 = r0.readParcelableCreator(r1, r2)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static <T> java.util.List<T> readParcelableList(@androidx.annotation.NonNull android.os.Parcel r0, @androidx.annotation.NonNull java.util.List<T> r1, @androidx.annotation.Nullable java.lang.ClassLoader r2, @androidx.annotation.NonNull java.lang.Class<T> r3) {
                java.util.List r0 = r0.readParcelableList(r1, r2, r3)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static <T extends java.io.Serializable> T readSerializable(@androidx.annotation.NonNull android.os.Parcel r0, @androidx.annotation.Nullable java.lang.ClassLoader r1, @androidx.annotation.NonNull java.lang.Class<T> r2) {
                java.lang.Object r0 = r0.readSerializable(r1, r2)
                java.io.Serializable r0 = (java.io.Serializable) r0
                return r0
        }

        @androidx.annotation.DoNotInline
        public static <T> android.util.SparseArray<T> readSparseArray(android.os.Parcel r0, java.lang.ClassLoader r1, java.lang.Class<? extends T> r2) {
                android.util.SparseArray r0 = r0.readSparseArray(r1, r2)
                return r0
        }
    }

    private ParcelCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    @androidx.annotation.OptIn(markerClass = {androidx.core.os.BuildCompat.PrereleaseSdkCheck.class})
    @android.annotation.SuppressLint({"ArrayReturn", "NullableCollection"})
    public static <T> T[] readArray(@androidx.annotation.NonNull android.os.Parcel r1, @androidx.annotation.Nullable java.lang.ClassLoader r2, @androidx.annotation.NonNull java.lang.Class<T> r3) {
            boolean r0 = androidx.core.os.BuildCompat.isAtLeastT()
            if (r0 == 0) goto Lb
            java.lang.Object[] r1 = androidx.core.os.ParcelCompat.TiramisuImpl.readArray(r1, r2, r3)
            return r1
        Lb:
            java.lang.Object[] r1 = r1.readArray(r2)
            return r1
    }

    @androidx.annotation.Nullable
    @androidx.annotation.OptIn(markerClass = {androidx.core.os.BuildCompat.PrereleaseSdkCheck.class})
    @android.annotation.SuppressLint({"ConcreteCollection", "NullableCollection"})
    public static <T> java.util.ArrayList<T> readArrayList(@androidx.annotation.NonNull android.os.Parcel r1, @androidx.annotation.Nullable java.lang.ClassLoader r2, @androidx.annotation.NonNull java.lang.Class<? extends T> r3) {
            boolean r0 = androidx.core.os.BuildCompat.isAtLeastT()
            if (r0 == 0) goto Lb
            java.util.ArrayList r1 = androidx.core.os.ParcelCompat.TiramisuImpl.readArrayList(r1, r2, r3)
            return r1
        Lb:
            java.util.ArrayList r1 = r1.readArrayList(r2)
            return r1
    }

    public static boolean readBoolean(@androidx.annotation.NonNull android.os.Parcel r0) {
            int r0 = r0.readInt()
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @androidx.annotation.Nullable
    @androidx.annotation.OptIn(markerClass = {androidx.core.os.BuildCompat.PrereleaseSdkCheck.class})
    @android.annotation.SuppressLint({"ConcreteCollection", "NullableCollection"})
    public static <K, V> java.util.HashMap<K, V> readHashMap(@androidx.annotation.NonNull android.os.Parcel r1, @androidx.annotation.Nullable java.lang.ClassLoader r2, @androidx.annotation.NonNull java.lang.Class<? extends K> r3, @androidx.annotation.NonNull java.lang.Class<? extends V> r4) {
            boolean r0 = androidx.core.os.BuildCompat.isAtLeastT()
            if (r0 == 0) goto Lb
            java.util.HashMap r1 = androidx.core.os.ParcelCompat.TiramisuImpl.readHashMap(r1, r2, r3, r4)
            return r1
        Lb:
            java.util.HashMap r1 = r1.readHashMap(r2)
            return r1
    }

    @androidx.annotation.OptIn(markerClass = {androidx.core.os.BuildCompat.PrereleaseSdkCheck.class})
    public static <T> void readList(@androidx.annotation.NonNull android.os.Parcel r1, @androidx.annotation.NonNull java.util.List<? super T> r2, @androidx.annotation.Nullable java.lang.ClassLoader r3, @androidx.annotation.NonNull java.lang.Class<T> r4) {
            boolean r0 = androidx.core.os.BuildCompat.isAtLeastT()
            if (r0 == 0) goto La
            androidx.core.os.ParcelCompat.TiramisuImpl.readList(r1, r2, r3, r4)
            goto Ld
        La:
            r1.readList(r2, r3)
        Ld:
            return
    }

    @androidx.annotation.OptIn(markerClass = {androidx.core.os.BuildCompat.PrereleaseSdkCheck.class})
    public static <K, V> void readMap(@androidx.annotation.NonNull android.os.Parcel r1, @androidx.annotation.NonNull java.util.Map<? super K, ? super V> r2, @androidx.annotation.Nullable java.lang.ClassLoader r3, @androidx.annotation.NonNull java.lang.Class<K> r4, @androidx.annotation.NonNull java.lang.Class<V> r5) {
            boolean r0 = androidx.core.os.BuildCompat.isAtLeastT()
            if (r0 == 0) goto La
            androidx.core.os.ParcelCompat.TiramisuImpl.readMap(r1, r2, r3, r4, r5)
            goto Ld
        La:
            r1.readMap(r2, r3)
        Ld:
            return
    }

    @androidx.annotation.Nullable
    @androidx.annotation.OptIn(markerClass = {androidx.core.os.BuildCompat.PrereleaseSdkCheck.class})
    public static <T extends android.os.Parcelable> T readParcelable(@androidx.annotation.NonNull android.os.Parcel r1, @androidx.annotation.Nullable java.lang.ClassLoader r2, @androidx.annotation.NonNull java.lang.Class<T> r3) {
            boolean r0 = androidx.core.os.BuildCompat.isAtLeastT()
            if (r0 == 0) goto Lb
            android.os.Parcelable r1 = androidx.core.os.ParcelCompat.TiramisuImpl.readParcelable(r1, r2, r3)
            return r1
        Lb:
            android.os.Parcelable r1 = r1.readParcelable(r2)
            return r1
    }

    @androidx.annotation.Nullable
    @androidx.annotation.OptIn(markerClass = {androidx.core.os.BuildCompat.PrereleaseSdkCheck.class})
    @android.annotation.SuppressLint({"ArrayReturn", "NullableCollection"})
    public static <T> T[] readParcelableArray(@androidx.annotation.NonNull android.os.Parcel r1, @androidx.annotation.Nullable java.lang.ClassLoader r2, @androidx.annotation.NonNull java.lang.Class<T> r3) {
            boolean r0 = androidx.core.os.BuildCompat.isAtLeastT()
            if (r0 == 0) goto Lb
            java.lang.Object[] r1 = androidx.core.os.ParcelCompat.TiramisuImpl.readParcelableArray(r1, r2, r3)
            return r1
        Lb:
            android.os.Parcelable[] r1 = r1.readParcelableArray(r2)
            return r1
    }

    @androidx.annotation.Nullable
    @androidx.annotation.OptIn(markerClass = {androidx.core.os.BuildCompat.PrereleaseSdkCheck.class})
    @androidx.annotation.RequiresApi(30)
    public static <T> android.os.Parcelable.Creator<T> readParcelableCreator(@androidx.annotation.NonNull android.os.Parcel r1, @androidx.annotation.Nullable java.lang.ClassLoader r2, @androidx.annotation.NonNull java.lang.Class<T> r3) {
            boolean r0 = androidx.core.os.BuildCompat.isAtLeastT()
            if (r0 == 0) goto Lb
            android.os.Parcelable$Creator r1 = androidx.core.os.ParcelCompat.TiramisuImpl.readParcelableCreator(r1, r2, r3)
            return r1
        Lb:
            android.os.Parcelable$Creator r1 = androidx.core.os.ParcelCompat.Api30Impl.readParcelableCreator(r1, r2)
            return r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.OptIn(markerClass = {androidx.core.os.BuildCompat.PrereleaseSdkCheck.class})
    @androidx.annotation.RequiresApi(api = 29)
    public static <T> java.util.List<T> readParcelableList(@androidx.annotation.NonNull android.os.Parcel r1, @androidx.annotation.NonNull java.util.List<T> r2, @androidx.annotation.Nullable java.lang.ClassLoader r3, @androidx.annotation.NonNull java.lang.Class<T> r4) {
            boolean r0 = androidx.core.os.BuildCompat.isAtLeastT()
            if (r0 == 0) goto Lb
            java.util.List r1 = androidx.core.os.ParcelCompat.TiramisuImpl.readParcelableList(r1, r2, r3, r4)
            return r1
        Lb:
            java.util.List r1 = androidx.core.os.ParcelCompat.Api29Impl.readParcelableList(r1, r2, r3)
            return r1
    }

    @androidx.annotation.Nullable
    @androidx.annotation.OptIn(markerClass = {androidx.core.os.BuildCompat.PrereleaseSdkCheck.class})
    public static <T extends java.io.Serializable> T readSerializable(@androidx.annotation.NonNull android.os.Parcel r1, @androidx.annotation.Nullable java.lang.ClassLoader r2, @androidx.annotation.NonNull java.lang.Class<T> r3) {
            boolean r0 = androidx.core.os.BuildCompat.isAtLeastT()
            if (r0 == 0) goto Lb
            java.io.Serializable r1 = androidx.core.os.ParcelCompat.TiramisuImpl.readSerializable(r1, r2, r3)
            return r1
        Lb:
            java.io.Serializable r1 = r1.readSerializable()
            return r1
    }

    @androidx.annotation.Nullable
    @androidx.annotation.OptIn(markerClass = {androidx.core.os.BuildCompat.PrereleaseSdkCheck.class})
    public static <T> android.util.SparseArray<T> readSparseArray(@androidx.annotation.NonNull android.os.Parcel r1, @androidx.annotation.Nullable java.lang.ClassLoader r2, @androidx.annotation.NonNull java.lang.Class<? extends T> r3) {
            boolean r0 = androidx.core.os.BuildCompat.isAtLeastT()
            if (r0 == 0) goto Lb
            android.util.SparseArray r1 = androidx.core.os.ParcelCompat.TiramisuImpl.readSparseArray(r1, r2, r3)
            return r1
        Lb:
            android.util.SparseArray r1 = r1.readSparseArray(r2)
            return r1
    }

    public static void writeBoolean(@androidx.annotation.NonNull android.os.Parcel r0, boolean r1) {
            r0.writeInt(r1)
            return
    }
}
