package androidx.activity.contextaware;

/* JADX INFO: loaded from: classes2.dex */
public interface ContextAware {
    void addOnContextAvailableListener(@androidx.annotation.NonNull androidx.activity.contextaware.OnContextAvailableListener r1);

    @androidx.annotation.Nullable
    android.content.Context peekAvailableContext();

    void removeOnContextAvailableListener(@androidx.annotation.NonNull androidx.activity.contextaware.OnContextAvailableListener r1);
}
