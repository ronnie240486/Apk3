package androidx.versionedparcelable;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class CustomVersionedParcelable implements androidx.versionedparcelable.VersionedParcelable {
    public CustomVersionedParcelable() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void onPostParceling() {
            r0 = this;
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void onPreParceling(boolean r1) {
            r0 = this;
            return
    }
}
