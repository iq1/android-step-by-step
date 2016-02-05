package com.andrey7mel.stepbystep.integration.other.di;

import com.andrey7mel.stepbystep.model.ModelImplTest;
import com.andrey7mel.stepbystep.other.di.AppComponent;
import com.andrey7mel.stepbystep.presenter.RepoInfoPresenterTest;
import com.andrey7mel.stepbystep.presenter.RepoListPresenterTest;
import com.andrey7mel.stepbystep.presenter.mappers.RepoBranchesMapperTest;
import com.andrey7mel.stepbystep.presenter.mappers.RepoContributorsMapperTest;
import com.andrey7mel.stepbystep.presenter.mappers.RepoListMapperTest;
import com.andrey7mel.stepbystep.view.fragments.RepoInfoFragmentTest;
import com.andrey7mel.stepbystep.view.fragments.RepoListFragmentTest;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {IntegrationTestModelModule.class, IntegrationTestPresenterModule.class, IntegrationTestViewModule.class})
public interface IntegrationTestComponent extends AppComponent {


    void inject(ModelImplTest dataRepositoryImplTest);

    void inject(RepoInfoPresenterTest repoInfoPresenterTest);

    void inject(RepoListPresenterTest repoListPresenterTest);

    void inject(RepoBranchesMapperTest repoBranchesMapperTest);

    void inject(RepoContributorsMapperTest repoContributorsMapperTest);

    void inject(RepoListMapperTest userReposMapperTest);

    void inject(RepoInfoFragmentTest repoInfoFragmentTest);

    void inject(RepoListFragmentTest repoListFragmentTest);
}
