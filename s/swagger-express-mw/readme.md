```
// Type definitions for swagger-express-mw 0.7
// Project: https://github.com/apigee-127/swagger-express#readme
// Definitions by: Michael Mrowetz <https://github.com/micmro>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
// TypeScript Version: 2.4
/* =================== USAGE ===================

import * as SwaggerExpress from "swagger-express-mw";
import * as express from "express";

let app = express();
let config: SwaggerExpress.Config = {
    appRoot: __dirname
};

SwaggerExpress.create(config, (err, middleware) => {
    if (err) {
        throw err; // or handle error
    }
    middleware.register(app);

    const port = process.env.PORT || 10010;
    app.listen(port);
});

 =============================================== */

```