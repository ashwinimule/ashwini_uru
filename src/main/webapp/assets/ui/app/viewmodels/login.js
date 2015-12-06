define(['plugins/router', 'durandal/app','plugins/http','knockout'], function (router, app,http,ko) {

    var email=ko.observable();
    var password=ko.observable();
    var rememberMe=ko.observable();

    var vm={
        email:email,
        password:password,
        rememberMe:rememberMe,
        signIn:signIn,
        activate: activate,
        logout:logout,
        canReuseForRoute: canReuseForRoute
    };
    return vm;

    function canReuseForRoute(){
        console.log("some route called.");
        console.log(arguments);

        return true;
    }

    function logout(){
       // session.isAuthenticated(false);
      //  session.profile.clear();
       // router.navigate('login');
        window.location.href='/CaseManagementSystem/login.jsp';
    }

    function activate(){
        console.log("login activated");
    }

    function signIn(){
//        console.log("Login now..."+config.configData.baseUrl+config.configData.authUrl+", email: "+email()+", pass: "+password());
//        return http.post('http://localhost:8888/application/auth/signin',{email: email(), password:password()}).then(function(response){
//            console.log(response);
//            session.isAuthenticated(true);
//            session.profile.populate(response);
//
//            router.navigate('');
//
//        });
    }
});