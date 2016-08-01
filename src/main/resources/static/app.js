(function () {
    'strict mode';

    angular
        .module('myApp', ['ui.router', 'myApp.main'])
        .config(function ($stateProvider) {
            $stateProvider
                .state('main', {
                    url: '/',
                    controller: 'MainController',
                    controllerAs: 'main',
                    templateUrl: 'main/main.template.html'
                });
        });

})();