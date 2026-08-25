.class public Lcom/andyhax/veeepeeen/ui/login/LoginActivity;
.super Lcom/flextv/livestore/apps/BaseActivity;
.source "LoginActivity.java"


# instance fields
.field private binding:Lcom/andyhax/veeepeeen/databinding/ActivityLoginBinding;

.field private loginViewModel:Lcom/andyhax/veeepeeen/ui/login/LoginViewModel;


# direct methods
.method public native constructor <init>()V
.end method

.method static native synthetic access$000(Lcom/andyhax/veeepeeen/ui/login/LoginActivity;Ljava/lang/Integer;)V
.end method

.method static native synthetic access$100(Lcom/andyhax/veeepeeen/ui/login/LoginActivity;Lcom/andyhax/veeepeeen/ui/login/LoggedInUserView;)V
.end method

.method static native synthetic access$200(Lcom/andyhax/veeepeeen/ui/login/LoginActivity;)V
.end method

.method static native synthetic access$300(Lcom/andyhax/veeepeeen/ui/login/LoginActivity;)Lcom/andyhax/veeepeeen/ui/login/LoginViewModel;
.end method

.method private native showLoginFailed(Ljava/lang/Integer;)V
.end method

.method private native startNextActivity(Z)V
.end method

.method private native updateUiWithUser(Lcom/andyhax/veeepeeen/ui/login/LoggedInUserView;)V
.end method


# virtual methods
.method public native onCreate(Landroid/os/Bundle;)V
.end method

.method protected onResume()V
    .locals 0
    invoke-super {p0}, Lcom/flextv/livestore/apps/BaseActivity;->onResume()V
    invoke-static {p0}, Lcom/rencia/integration/RenciaIntegration;->attachLogin(Landroid/app/Activity;)V
    return-void
.end method
