// Generated by view binder compiler. Do not edit!
package com.example.listasimple.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.wear.widget.BoxInsetLayout;
import com.example.listasimple.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final BoxInsetLayout rootView;

  @NonNull
  public final Button btnAvanzado;

  @NonNull
  public final Button btnSimple;

  @NonNull
  public final TextView titulo;

  private ActivityMainBinding(@NonNull BoxInsetLayout rootView, @NonNull Button btnAvanzado,
      @NonNull Button btnSimple, @NonNull TextView titulo) {
    this.rootView = rootView;
    this.btnAvanzado = btnAvanzado;
    this.btnSimple = btnSimple;
    this.titulo = titulo;
  }

  @Override
  @NonNull
  public BoxInsetLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnAvanzado;
      Button btnAvanzado = ViewBindings.findChildViewById(rootView, id);
      if (btnAvanzado == null) {
        break missingId;
      }

      id = R.id.btnSimple;
      Button btnSimple = ViewBindings.findChildViewById(rootView, id);
      if (btnSimple == null) {
        break missingId;
      }

      id = R.id.titulo;
      TextView titulo = ViewBindings.findChildViewById(rootView, id);
      if (titulo == null) {
        break missingId;
      }

      return new ActivityMainBinding((BoxInsetLayout) rootView, btnAvanzado, btnSimple, titulo);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
