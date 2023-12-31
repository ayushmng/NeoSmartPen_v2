// Generated by view binder compiler. Do not edit!
package kr.neolab.samplecode.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import kr.neolab.samplecode.R;

public final class ListLayoutBinding implements ViewBinding {
  @NonNull
  private final TextView rootView;

  @NonNull
  public final TextView listLayout;

  private ListLayoutBinding(@NonNull TextView rootView, @NonNull TextView listLayout) {
    this.rootView = rootView;
    this.listLayout = listLayout;
  }

  @Override
  @NonNull
  public TextView getRoot() {
    return rootView;
  }

  @NonNull
  public static ListLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ListLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.list_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ListLayoutBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    TextView listLayout = (TextView) rootView;

    return new ListLayoutBinding((TextView) rootView, listLayout);
  }
}
