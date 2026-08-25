package androidx.core.content;

/* JADX INFO: loaded from: classes.dex */
public interface OnConfigurationChangedProvider {
    void addOnConfigurationChangedListener(@androidx.annotation.NonNull androidx.core.util.Consumer<android.content.res.Configuration> r1);

    void removeOnConfigurationChangedListener(@androidx.annotation.NonNull androidx.core.util.Consumer<android.content.res.Configuration> r1);
}
