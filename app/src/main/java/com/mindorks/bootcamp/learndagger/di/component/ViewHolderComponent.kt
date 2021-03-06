package com.mindorks.bootcamp.learndagger.di.component

import com.mindorks.bootcamp.learndagger.di.ViewHolderScope
import com.mindorks.bootcamp.learndagger.di.module.ViewHolderModule
import com.mindorks.bootcamp.learndagger.ui.home.Post.PostViewHolder
import dagger.Component

@ViewHolderScope
@Component(
        dependencies = [ApplicationComponent::class],
        modules = [ViewHolderModule::class]
)
interface ViewHolderComponent {

    fun inject(viewHolder: PostViewHolder)
}