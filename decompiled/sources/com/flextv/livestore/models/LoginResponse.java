package com.flextv.livestore.models;

/* JADX INFO: loaded from: classes2.dex */
public class LoginResponse {
    private com.flextv.livestore.models.ServerModel server_info;
    private com.flextv.livestore.models.LoginModel user_info;

    public LoginResponse() {
            r0 = this;
            r0.<init>()
            return
    }

    public com.flextv.livestore.models.ServerModel getServerModel() {
            r1 = this;
            com.flextv.livestore.models.ServerModel r0 = r1.server_info
            return r0
    }

    public com.flextv.livestore.models.LoginModel getUser_info() {
            r1 = this;
            com.flextv.livestore.models.LoginModel r0 = r1.user_info
            return r0
    }

    public void setServerModel(com.flextv.livestore.models.ServerModel r1) {
            r0 = this;
            r0.server_info = r1
            return
    }

    public void setUser_info(com.flextv.livestore.models.LoginModel r1) {
            r0 = this;
            r0.user_info = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "LoginResponse{user_info="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            com.flextv.livestore.models.LoginModel r1 = r2.user_info
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r1 = "server_info="
            r0.append(r1)
            com.flextv.livestore.models.ServerModel r1 = r2.server_info
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
