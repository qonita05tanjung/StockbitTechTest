describe('API Test', function(){

    it('Get Request', function(){
        cy.request('GET', 'https://petstore.swagger.io/v2/pet/findByStatus?status=available')
        .then((response) => {
            expect(response.status).to.eq(200)
        });

    });

    it('Post Request', function(){
        cy.request({
            method: 'POST', 
            url: 'https://petstore.swagger.io/v2/pet',
            header: {
                'content-type' : 'application/json'
            },
            body: {
                    "id": 0,
                    "category": {
                      "id": 0,
                      "name": "string"
                    },
                    "name": "doggie",
                    "photoUrls": [
                      "string"
                    ],
                    "tags": [
                      {
                        "id": 0,
                        "name": "string"
                      }
                    ],
                    "status": "available"
            }
        }).then((response=>{
            expect(response.status).to.eq(200);     
    }));

});

    it('Put Request', function(){
        cy.request('PUT', 'https://petstore.swagger.io/v2/pet',
        {
            "id": 0,
            "category": {
              "id": 0,
              "name": "string"
            },
            "name": "doggie",
            "photoUrls": [
              "string"
            ],
            "tags": [
              {
                "id": 0,
                "name": "string"
              }
            ],
            "status": "available"
          })
          .then((response)=> {
              expect(response.status).to.eq(200);
          });
    });

    it('Delete Request', function(){
        cy.request('DELETE', 'https://petstore.swagger.io/v2/pet/0')
    }).then((response) => {
        expect(response.status).to.eq(200);
    });
});