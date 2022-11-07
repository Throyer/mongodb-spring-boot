db = db.getSiblingDB('cart');
db.createUser(
  {
    user: 'root',
    pwd: 'root',
    roles: [{ role: 'readWrite', db: 'cart' }],
  },
);