package org.androidannotations.api.sharedpreferences;

import org.androidannotations.api.sharedpreferences.EditorHelper;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractPrefEditorField<T extends org.androidannotations.api.sharedpreferences.EditorHelper<T>> {
    public final T editorHelper;
    public final java.lang.String key;

    public AbstractPrefEditorField(T r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.editorHelper = r1
            r0.key = r2
            return
    }

    public final T remove() {
            r2 = this;
            T extends org.androidannotations.api.sharedpreferences.EditorHelper<T> r0 = r2.editorHelper
            android.content.SharedPreferences$Editor r0 = r0.getEditor()
            java.lang.String r1 = r2.key
            r0.remove(r1)
            T extends org.androidannotations.api.sharedpreferences.EditorHelper<T> r0 = r2.editorHelper
            return r0
    }
}
